package medium.bitwiseandofnumbersrange_100;

public class Solution {
    public static int rangeBitwiseAnd(int left, int right) {
        int res = left;
        for (long i = left + 1; i <= right; i++) {
            res &= i;
            if (res == 0) return 0;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(2147483646, 2147483647));
    }
}
