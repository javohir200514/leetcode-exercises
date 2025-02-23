package easy.math.singleNumber_34;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int one=nums[0],j=nums.length-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                i++;
                continue;
            }else if(nums[i-1]!=nums[i]){
                return nums[i-1];
            }else if(nums[j-1]==nums[j]){
                j--;
                continue;
            }else{
                return nums[i-1];
            }

        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        return 0;

    }
}
