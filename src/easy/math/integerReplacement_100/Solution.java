package easy.math.integerReplacement_100;

public class Solution {
    public int integerReplacement(int n) {
        long n1=n;
        int count=0;
        while(n1!=1){
            if(n1%2==0){
                n1/=2;
                count++;
            }else{
                if (n1== 3 || (n1 & 2) == 0) {
                    n1 -= 1;
                    count++;
                } else {
                    n1 += 1;
                    count++;
                }
            }
        }
        return count;
    }
}
