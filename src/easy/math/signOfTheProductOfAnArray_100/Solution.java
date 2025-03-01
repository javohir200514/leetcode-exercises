package easy.math.signOfTheProductOfAnArray_100;

public class Solution {
        public int arraySign(int[] nums) {
            int count1=0,count2=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    return 0;
                }else if(nums[i]<0){
                    count2++;
                }
            }
            if(count2%2==0){
                return 1;
            }else{
                return -1;
            }
        }
}
