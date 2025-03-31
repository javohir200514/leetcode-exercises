package easy.math.divisibleAndNonDivisibleSumsDifference_100;

public class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0,mSum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                mSum+=i;
            }else sum+=i;
        }
        return sum-mSum;
    }
}
