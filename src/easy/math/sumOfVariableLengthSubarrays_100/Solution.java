package easy.math.sumOfVariableLengthSubarrays_100;

public class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(0<=i-nums[i]){
                for(int j=i-nums[i];j<=i;j++){
                    sum+=nums[j];
                }

            }else {
                for(int j=0;j<=i;j++){
                    sum+=nums[j];
                }
            }
        }
        return sum;
    }
}
