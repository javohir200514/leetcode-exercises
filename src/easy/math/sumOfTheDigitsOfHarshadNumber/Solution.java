package easy.math.sumOfTheDigitsOfHarshadNumber;

public class Solution {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x<10){
            return x;
        }else if(x<100){
            if(x%(x%10+x/10%10)==0){
                return x%10+x/10%10;
            }
        }
        else if(x<1000) {
            if (x%(x % 10 + x / 10 % 10 + x / 100 % 10)  == 0) {
                return x % 10 + x / 10 % 10 + x / 100 % 10;
            }
        }
        return -1;
    }
}
