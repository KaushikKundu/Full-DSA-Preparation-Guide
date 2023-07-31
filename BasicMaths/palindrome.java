public class Solution {
    public static boolean palindromeNumber(int n) {
        // Write your code here.
        int x = n;
        int r, d, rev = 0;
        while (x != 0) {// 1
            r = x % 10; // 1
            x = x / 10; // 0
            rev = rev * 10 + r;// 10

        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }

    }
}