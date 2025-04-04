package easy.math.findThePivotInteger_75;

public class Solution {
    public int pivotInteger(int n) {
        int sum1=0,sum2=0;
        for (int i = 1; i <= n; i++) {
            if(((1+i)*i)/2==((i+n)*(n-i+1))/2){
                return i;
            }
        }
        return -1;
    }
}
