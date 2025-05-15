package easy.math.base7_100;

public class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder s=new StringBuilder();
        int a=1;
        if(num<0){
            num*=-1;
            a=-1;
        }
        while (num!=0){
            s.append(num%7);
            num/=7;
        }
        if(a<0) s.append("-");
        return s.reverse().toString();
    }
}
