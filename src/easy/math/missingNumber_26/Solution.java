package easy.math.missingNumber_26;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i++){
                return --i;
            }
            i--;

        }
        return n;
    }

}
