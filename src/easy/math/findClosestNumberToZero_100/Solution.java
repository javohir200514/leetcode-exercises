package easy.math.findClosestNumberToZero_100;

public class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min&&nums[i]>=0){
                min=nums[i] ;
            }else if(nums[i]>max&&nums[i]<=0){
                max=nums[i];
            }
        }

        if(min==Integer.MAX_VALUE){
            return max;
        }
        if(max==Integer.MIN_VALUE){
            return min;
        }
        if(Math.abs(min)>Math.abs(max)){
            return max;
        }
        return min;
    }
}
