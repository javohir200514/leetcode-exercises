package easy.math.sortarraybyparityii_100;

public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even=new int[nums.length/2];
        int[] odd=new int[nums.length/2];
        int indexOdd=0,indexEven=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0) even[indexEven++]=nums[i];
            else odd[indexOdd++]=nums[i];
        }
        indexOdd=0;
        indexEven=0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0) nums[i]=even[indexEven++];
            else nums[i]=odd[indexOdd++];
        }
        return nums;
    }
}
