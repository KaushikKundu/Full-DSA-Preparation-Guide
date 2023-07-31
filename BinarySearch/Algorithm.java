package BinarySearch;

public class Algorithm {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5,6 ,7, 23, 45, 46, 67};
        int target = 5;
        int index = BinarySearch(arr,target);
        System.out.println(index);
    }
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return  mid;
            }
        }
        return -1;
    }
}
