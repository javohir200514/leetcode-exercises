package easy.math.numberOf1Bits_100;

public class Solution {
    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if(n%2!=0){
                count++;
            }
            n/=2;
        }
        return count;
    }
}
