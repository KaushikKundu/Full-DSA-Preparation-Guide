package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {79, 67, 45, 33, 24, 18, 10, 9, 3, 1};
        int target = 10;

        int index = OrderAgnosticAlgo(arr, target);
        System.out.println(index);
    }

    static int OrderAgnosticAlgo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
