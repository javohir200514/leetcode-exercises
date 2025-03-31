package easy.math.findTheSumOfEncryptedIntegers_100;

public class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum+=nums[i];
            }else {
                int max=Integer.MIN_VALUE,a=nums[i],j=0;
                while(a!=0){
                    if(a%10>max){
                        max=a%10;
                    }
                    a/=10;
                    j++;
                }
                int result=0;
                while(j>0){
                    result=result*10+max;
                    j--;
                }
                sum+=result;
            }
        }
        return sum;
    }
}
