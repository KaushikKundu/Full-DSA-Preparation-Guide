public class Solution {
    public static int calcGCD(int n, int m) {
        // Write your code here.
        int gcd = 0;
        for(int r=2; r <= m || r <= n; r++) {
            
            if (m % r == 0 && n % r == 0) {
                gcd = r;
                
            }
        }
        if(gcd == 0){
            return 1;
        }else{
            return gcd;
        }
    }
}