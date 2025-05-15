package easy.math.setmismatch_96;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        int[] result=new int[2];
        for (int i = 1; i <= nums.length; i++) {
            if(a[i]==2){
                result[0]=i;
            }else if(a[i]==0){
                result[1]=i;
            }
        }
        return result;
    }
}
