package easy.math.maxConsecutiveOnes_94;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,a=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                a=count;
            }else{
                count=0;
            }
            if(a>max){
                max=a;
            }

        }
        return max;
    }
}
