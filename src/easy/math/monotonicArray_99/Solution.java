package easy.math.monotonicArray_99;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=2){
            return true;
        }
        int a=0;
        boolean b=false;
        if(nums[0]<=nums[nums.length-1]){
            for(int i=1;i<nums.length;i++){
                if(nums[i]>=nums[a]){
                    b= true;
                }else{
                    return false;
                }
                a++;
            }
        }else{
            for(int i=1;i<nums.length;i++){
                if(nums[i]<=nums[a]){
                    b= true;
                }else{
                    return false;
                }
                a++;
            }
        }
        return b;
    }
}
