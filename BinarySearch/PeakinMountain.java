package BinarySearch;

public class PeakinMountain {
    public int peakIndexInMountainArray(int[] arr) {

    int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
           //analyzing the upward slope only
            if (arr[mid] > arr[mid + 1]){
                end = mid ;
            }
            else {
                start = mid + 1;
            }
        }
        
        return start;// could've returned end as both point to the ans, peak value in mountain
    }

}
