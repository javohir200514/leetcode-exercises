package easy.math.applyOperationsToAnArray_83;

public class Solution {
    public int[] applyOperations(int[] nums) {
        int[] newNum = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i==nums.length-1){
                break;
            }
            if (nums[i] == nums[i + 1]) {
                nums[i] = 2 * nums[i];
                nums[i+1]=0;
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                newNum[j]=nums[i];
                j++;
            }
        }
        return newNum;
    }
}

