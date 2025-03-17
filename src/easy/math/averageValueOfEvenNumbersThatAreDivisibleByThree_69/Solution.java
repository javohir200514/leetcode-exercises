package easy.math.averageValueOfEvenNumbersThatAreDivisibleByThree_69;

public class Solution {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0&&nums[i]%3==0){
                sum+=nums[i];
                count++;
            }
        }
        if(count==0) return 0;
        int result=sum/count;
        return result;
    }
}
