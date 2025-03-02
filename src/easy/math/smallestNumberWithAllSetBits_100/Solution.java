package easy.math.smallestNumberWithAllSetBits_100;

public class Solution {
    public int smallestNumber(int n) {
        int sum=0;
        for(int i=0;i<12;i++){
            sum+=Math.pow(2,i);
            n/=2;
            if(n==0){
                break;
            }
        }
        return sum;

    }
}
