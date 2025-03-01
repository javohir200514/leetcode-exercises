package easy.math.differenceBetweenElementSumAndDigitSumOfAnArray_99;

public class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
            if(nums[i]<10){
                sum2+=nums[i];
            }else if(nums[i]<100){
                sum2+=nums[i]%10+nums[i]/10%10;
            }else if(nums[i]<1000){
                sum2+=nums[i]%10+nums[i]/10%10+nums[i]/100%10;
            }else{
                sum2+=nums[i]%10+nums[i]/10%10+nums[i]/100%10+nums[i]/1000%10;
            }
        }
        return Math.abs(sum2-sum1);
    }
}
