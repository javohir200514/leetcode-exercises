package easy.math.keepMultiplyingFoundValuesByTwo_94;

public class Solution {
    public int findFinalValue(int[] nums, int original) {
        int a = 0;
        while (a < nums.length) {
            if (original == nums[a]) {
                original *= 2;
                nums[a] = 0;
                a = 0;
            }else{
                a++;
            }

        }

        return original;
    }
}
