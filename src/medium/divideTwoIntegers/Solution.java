package medium.divideTwoIntegers;

public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==1){
            return dividend;
        }
        if(dividend==-2147483648&&divisor==-1){
            return 2147483647;
        }else if(divisor==-1){
            return -dividend;
        }
        if(dividend==divisor){
            return 1;
        }else if(dividend==-divisor||divisor==-dividend){
            return -1;
        }
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }
        if(dividend<0&&divisor>0||dividend>0&&divisor<0){
            return -count;
        }else return count;

    }

}
