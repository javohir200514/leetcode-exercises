package easy.math.calculateMoneyInLeetcodeBank_100;

public class Solution {
    public int totalMoney(int n) {
        int sum=0,lower=1,upper=7;
        while (true){

            if(n>7){
                sum+= ((lower+upper)*7)/2;
                n-=7;
            }else{
                while (n!=0){
                    sum+=lower++;
                    n--;
                }
            }

            lower++;
            upper++;
            if(n==0){
                return sum;
            }

        }
    }
}
