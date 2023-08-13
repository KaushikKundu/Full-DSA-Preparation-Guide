package BinarySearch;
  //Mountain Array is an api interface. 
class Solution {   
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int peak = peakIndexInMountainArray(mountainArr);
       int firstTry = OrderAgnosticAlgo(mountainArr, target, 0, peak);
       if(firstTry != -1)
        return firstTry;
        else
            return OrderAgnosticAlgo(mountainArr, target, peak+1, mountainArr.length() - 1);
         
    }
    public int peakIndexInMountainArray(MountainArray mountainArr) {

         int start = 0;
         int end = mountainArr.length() - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid ;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int OrderAgnosticAlgo(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);
        
        while(start <= end) {
             int mid = start + (end - start) / 2;
             int midValue = arr.get(mid);
            if (target == midValue) {
                return mid;
            }
            if (isAsc) {
                if (target <midValue ) {
                    end = mid - 1;
                } else if (target > midValue) {
                    start = mid + 1;
                }
            } else {
                if (target < midValue) {
                    start = mid + 1;
                } else if (target > midValue) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}




