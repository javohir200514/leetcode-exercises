package easy.math.minimumDistanceToTheTargetElement_100;

public class Solution {

    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target&&Math.abs(i-start)<min){
                min=Math.abs(i-start);
            }

        }
        return min;
    }
}
