package easy.math.smallestDivisibleDigitProductI_100;

public class Solution {
    public int smallestNumber(int n, int t) {

        if(n<=t) return t;
        int k=1,a;
        while(true){
            a=n;
            while(n!=0){
                k*=n%10;
                n/=10;
            }
            if(k==0){
                return a;
            }else if(k%t==0&&k>=t){
                return a;
            }
            n=++a;
            k=1;
        }
    }
}
