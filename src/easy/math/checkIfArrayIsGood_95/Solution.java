package easy.math.checkIfArrayIsGood_95;

public class Solution {
    public boolean isGood(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums.length-1){
                return false;
            }
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i!=j&&nums[i]!=nums.length-1){
                    return false;
                }
            }
            if(nums[i]==nums.length-1){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
