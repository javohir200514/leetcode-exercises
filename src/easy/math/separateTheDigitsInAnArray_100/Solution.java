package easy.math.separateTheDigitsInAnArray_100;

public class Solution {
    public int[] separateDigits(int[] nums) {
        int totalDigits = 0;
        for (int num : nums) {
            int temp = num;
            while (temp > 0) {
                totalDigits++;
                temp /= 10;
            }
        }

        int[] result = new int[totalDigits];
        int index = totalDigits - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            while (num > 0) {
                result[index--] = num % 10;
                num /= 10;
            }
        }

        return result;
    }
}
