package easy.math.countequalanddivisiblepairsinanarray_99;

public class Solution {
    public int countPairs(int[] nums, int k) {
        int j=0,count=0;
        while (j<nums.length-1) {
            for (int i = j+1; i < nums.length ; i++) {
                if ((j*i%k==0)&&nums[j] == nums[i]) {
                    count++;
                }
            }
            j++;
        }
        return count;
    }
}
