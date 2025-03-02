package easy.math.minimumElementAfterReplacementWithDigitSum_100;

public class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
             if(nums[i]>=10&&nums[i]<100){
                nums[i]=nums[i]%10+nums[i]/10%10;
            }else if(nums[i]>=100&&nums[i]<1000){
                nums[i]=nums[i]%10+nums[i]/10%10+nums[i]/100%10;
            }else if(nums[i]>=1000&&nums[i]<10000){
                nums[i]=nums[i]%10+nums[i]/10%10+nums[i]/100%10+nums[i]/1000%10;
            }else if(nums[i]==10000){
                nums[i]=1;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }

        return min;
    }
}
