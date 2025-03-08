package easy.math.numberComplement_100;

public class Solution {
    public int findComplement(int num) {
        int num2=0,i=0;
        while(num!=0){
            if(num%2==0){
                num2+=Math.pow(2,i);
            }
            i++;
            num/=2;
        }
        return num2;
    }
}
