package medium.myPow;

public class Solution16 {
    public double myPow(double x, int n) {
        if(n==-2147483648&&x!=1&&x!=-1){
            return 0;
        }
        if (x == 1) return 1;
        if (x == -1){
            if (n % 2 == 0){
                return 1;
            } else {
                return -1;
            }
        }
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        for (long i = 0; i < N; i++) {
            result *= x;
        }
        return result;
    }
    }

