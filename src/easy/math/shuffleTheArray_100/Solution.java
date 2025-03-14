package easy.math.shuffleTheArray_100;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp=0;
        int[] newNum=new int[nums.length];
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                newNum[i]=nums[temp];
            }else{
                newNum[i]=nums[n+temp];
                temp++;
            }

        }
        return newNum;
    }
}
