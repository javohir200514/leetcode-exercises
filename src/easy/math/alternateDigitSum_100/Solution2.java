package easy.math.alternateDigitSum_100;

class Solution2 {
    public int alternateDigitSum(int n) {
        int count = 0, result = n, sum = 0;
        while (result != 0) {
            while (n != 0) {
                count++;
                n /= 10;
            }
            if (count % 2 == 0) {
                sum -= result % 10;
                result /= 10;
            } else {
                sum += result % 10;
                result /= 10;
            }
            n = result;
            count=0;


        }
        return sum;

    }
}
