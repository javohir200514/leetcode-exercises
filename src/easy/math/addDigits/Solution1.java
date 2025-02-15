package easy.math.addDigits;

public class Solution1 {
    public int addDigits(int num) {
        int sum=0,result;
        while(true) {
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            if (sum < 10) {
                return sum;
            }
            num = sum;
            sum=0;

        }

    }
}
