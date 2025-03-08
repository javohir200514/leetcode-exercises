package easy.math.countPartitionsWithEvenSumDifference_100;

public class Solution {
    public int countPartitions(int[] nums) {
        int j=1,sum1=0,sum2=0,count=0;
        while(true){
            for(int i=0;i<j;i++){
                sum1+=nums[i];
            }
            for(int i=j;i<nums.length;i++){
                sum2+=nums[i];
            }
            if((sum1-sum2)%2==0){
                count++;
            }
            if(j==nums.length-1){
                break;
            }
            j++;
            sum1=0;
            sum2=0;
        }
        return count;

    }
}
