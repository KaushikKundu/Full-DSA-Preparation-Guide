package BinarySearch;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9 , 10, 15, 29, 34};
        int target = 403;
        System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
        
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        int mid = (start + end) / 2;
        
            if (start > end) {
            return -1; 
            }

            if (target > arr[mid]) {
               return BinarySearch(arr, target, mid + 1, end);
            } else if (target < arr[mid]) {
                return BinarySearch(arr, target, start, mid - 1);
            } else {
                return mid;
            }

            
        

    }

}
