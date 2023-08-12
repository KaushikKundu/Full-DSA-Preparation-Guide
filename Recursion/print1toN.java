package Recursion;
import java.util.Arrays;

public class print1toN {
    public static void main(String[] args) {
        int x = 5;
        System.out.print( Arrays.toString(printNos(x)));
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
         int[] arr = new int[x];
        return fun(i, x);

    }

    static int[] fun(int i, int x) {
        
        arr[i] = i + 1;

        if (i == x - 1) {
            return arr;
        } else {

            return fun(i + 1, x);
        }
    }
}
