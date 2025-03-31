package easy.math.thousandSeparator_100;

public class Solution {
    public String thousandSeparator(int n) {
        if(n<1000){
            return Integer.toString(n);
        }
        int a=n;
        int length=0;
        while (a!=0){
            a/=10;
            length++;
        }
        StringBuilder s=new StringBuilder();
        int count=0;
        while (n!=0){
            count++;
            s.append(n%10);
            if(count%3==0&&count!=length){
                s.append(".");
            }
            n/=10;
        }
        return s.reverse().toString();
    }
}
