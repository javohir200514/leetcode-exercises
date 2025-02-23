package easy.math.countIntegersWithEvenDigitSum_88;

public class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i < 10) {
                if (i % 2 == 0) {
                    count++;
                }
            } else if (i < 100) {
                if ((i % 10 + i / 10 % 10) % 2 == 0) {
                    count++;
                }

            } else if (i < 1000) {
                if ((i % 10 + i / 10 % 10 + i / 100 % 10) % 2 == 0) {
                    count++;
                }

            }
        }
        return count;
    }
}
