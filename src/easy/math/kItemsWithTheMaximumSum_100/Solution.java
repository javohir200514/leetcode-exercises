package easy.math.kItemsWithTheMaximumSum_100;

public class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k==0)return 0;
        if(k<=numOnes) return k;
        if(numOnes+numZeros>=k) return numOnes;
        return numOnes+( numOnes+numZeros-k);
    }
}
