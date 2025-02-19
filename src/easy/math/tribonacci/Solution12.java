package easy.math.tribonacci;

public class Solution12 {
    public int tribonacci(int n) {
        if(n<=1){
            return n;
        }
        if (n==2) return 1;
        int t0=0,t1=1,t2=1,t=0;
        for(int i=3;i<=n;i++){
            t=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=t;
        }
        return t;
    }
}
