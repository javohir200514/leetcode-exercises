package easy.math.maximumProductDifferenceBetweenTwoPairs_99;

public class Solution {
    public int maxProductDifference(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,minProduct=Integer.MAX_VALUE,maxProduct=Integer.MIN_VALUE;
        int minIndex=0,maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxIndex=i;
            }
            if(min>nums[i]){
                min=nums[i];
                minIndex=i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(max*nums[i]>maxProduct&&maxIndex!=i){
                maxProduct=max*nums[i];
            }
            if(min*nums[i]<minProduct&&minIndex!=i){
                minProduct=min*nums[i];
            }
        }

        return maxProduct-minProduct;

    }
}
