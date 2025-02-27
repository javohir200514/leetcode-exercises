package medium.reverseInteger_100;

public class Solution {
    public int reverse(int x) {
        int a=x;
        if(x<0){
            x=-x;
        }
        long sum=0;
        while(x!=0){
            sum=sum*10+x%10;
            x/=10;
            if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE){
                return 0;
            }
        }
        if(a<0){
            return (int)(-sum);
        }
        return (int)(sum);
    }
}
