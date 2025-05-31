package easy.math.maximumstrongpairxori_97;

public class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0,n=nums.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j < n; j++) {
                int a=nums[i],b=nums[j];
                if(Math.abs(a-b)<=Math.min(a,b)){
                    max=Math.max(max,a^b);
                }
            }
        }
        return max;
    }
}
