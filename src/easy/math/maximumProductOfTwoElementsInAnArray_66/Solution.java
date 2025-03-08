package easy.math.maximumProductOfTwoElementsInAnArray_66;

public class Solution {
    public int maxProduct(int[] nums) {
        int maxa=Integer.MIN_VALUE,max=nums[0],index=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if((max-1)*(nums[i]-1)>maxa&&i!=index){
                maxa=(max-1)*(nums[i]-1);
            }
        }
        return maxa;
    }
}
