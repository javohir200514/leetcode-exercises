package easy.math.countoperationstoobtainzero_90;

public class Solution {
    public int countOperations(int num1, int num2) {
        int temp=0;
        if(num1==0||num2==0) return 0;
        if(num1==num2) return 1;
        while(num1!=0&&num2!=0){
            if(num1>=num2) num1-=num2;
            else num2-=num1;
            temp++;
        }
        return temp;
    }
}
