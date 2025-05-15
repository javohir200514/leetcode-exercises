package easy.math.findpivotindex_93;

public class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) return 0;
        int[] arr1=new int[nums.length+1];
        int[] arr2=new int[nums.length+1];
        int sum=0;
        for (int i = 0; i <nums.length; i++) {
            sum+=nums[i];
            arr1[i+1]=sum;
        }
        sum=0;
        for (int i = nums.length-1; i >=0 ; i--) {
            sum+=nums[i];
            arr2[i]=sum;
        }
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            if(arr1[i] == arr2[i + 1]){
                return i;
            }
        }
        return -1;
    }
}
