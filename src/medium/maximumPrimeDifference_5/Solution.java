package medium.maximumPrimeDifference_5;

public class Solution {
    public static int maximumPrimeDifference(int[] nums) {
        int mini=0,maxj=0;
        for(int i=0;i<nums.length;i++){
            if(prime(nums[i])){
                mini=i;
                for(int j=0;j<nums.length;j++){
                    if(prime(nums[j])){
                        maxj=j;
                    }
                }
                return Math.abs(maxj-mini);
            }
        }
        return 0;
    }
    public static boolean prime(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count==2;
    }
}
