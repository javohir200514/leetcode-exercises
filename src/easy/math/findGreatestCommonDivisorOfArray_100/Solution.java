package easy.math.findGreatestCommonDivisorOfArray_100;

public class Solution {
    public int findGCD(int[] nums) {
        int a=1,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=1;i<=min;i++){
            if(min%i==0&&max%i==0){
                a=i;
            }
        }
        return a;
    }
}
