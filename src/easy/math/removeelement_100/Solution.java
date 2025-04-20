package easy.math.removeelement_100;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1) break;
            if(nums[i]!=val){
                count++;
            }else{
                a++;
                for (int j = i; j < nums.length-a; j++) {
                    nums[j]=nums[j+1];
                }
                nums[nums.length-a]=-1;
                i-=1;
            }


        }
        return count;
    }
}
