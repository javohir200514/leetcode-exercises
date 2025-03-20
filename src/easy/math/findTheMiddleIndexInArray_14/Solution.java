package easy.math.findTheMiddleIndexInArray_14;

public class Solution {
    public int findMiddleIndex(int[] nums) {
        int left=0,right=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j<i){
                    left+=nums[j];
                }else if(i!=j){
                    right+=nums[j];
                }
            }
            if(right==left){
                return i;
            }
            right=0;
            left=0;
        }
        return -1;
    }
}
