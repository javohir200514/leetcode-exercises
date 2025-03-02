package easy.math.checkBalancedString_100;

public class Solution {
    public boolean isBalanced(String num) {
        int sum1=0,sum2=0;
        for (int i = 0; i < num.length(); i++) {
            if(i%2==0){
                sum1+=(int)(num.charAt(i))-'0';
            }else{
                sum2+=(int)(num.charAt(i))-'0';
            }
        }
        return sum1==sum2;
    }
}
