package easy.math.transformArrayByParity;

public class Solution {
    public int[] transformArray(int[] nums) {
        int[] n=new int[nums.length];
        int j=0,a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                n[a]=0;
                a++;
            }else{
                n[nums.length-1-j]=1;
                j++;
            }
        }
        return n;

    }
}
