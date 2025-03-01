package easy.math.findNumbersWithEvenNumberOfDigits_99;

public class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=10&&nums[i]<100){
                count++;
            }else if(nums[i]>999&&nums[i]<10000){
                count++;
            }else if(nums[i]==100000){
                count++;
            }
        }
        return count;
    }
}
