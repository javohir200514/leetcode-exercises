package easy.math.countTheDigitsThatDivideNumber_100;

public class Solution {
    public int countDigits(int num) {
        int a=num,count=0;
        while(num!=0){
            if(a%(num%10)==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
