package easy.math.nRepeatedElementInSize2nArray_54;

public class Solution {
    public int repeatedNTimes(int[] nums) {
        int count=1,a=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&i!=j){
                    count++;
                }
            }
            if(count==nums.length/2){
                a= nums[i];
                break;
            }
            count=1;
        }
        return a;

    }
}
