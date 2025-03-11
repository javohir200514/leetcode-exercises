package easy.math.maximumCountOfPositiveIntegerAndNegativeInteger_100;

public class Solution {
    public int maximumCount(int[] nums) {
        int count=0,count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++;
            }else if(nums[i]<0){
                count1++;
            }
        }
        if(count1>count){
            return count1;
        }
        return count;
    }
}
