package easy.math.mySqrt;

public class Solution10 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int pow = 1;
        for (long i = 1; i * i <= x; i++) {
            pow = (int) i;
        }

        return pow;
    }
}
