package medium.singleNumberiii_48;

import java.util.Arrays;

public class Solution {
    public static int[] singleNumber(int[] nums) {
        if(nums.length==2){
            return nums;
        }
        Arrays.sort(nums);
        int j=0;
        int[] array=new int[2];
        if(nums[nums.length-1]!=nums[nums.length-2]){
            array[j]=nums[nums.length-1];
            j++;
        }
        if(nums[0]!=nums[1]){
            array[j]=nums[0];
            j++;
        }
        if(j==2){
            return array;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]!=nums[i]&&nums[i]!=nums[i+1]){
                array[j]=nums[i];
                j++;
            }
        }
        return array;

    }
}
