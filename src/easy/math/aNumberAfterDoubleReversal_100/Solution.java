package easy.math.aNumberAfterDoubleReversal_100;

public class Solution {
    public boolean isSameAfterReversals(int num) {
        int result=0,number=num;
        while (num!=0){
            result=result*10+num%10;
            num/=10;
        }
        int revese=0;
        while (result!=0){
            revese=revese*10+result%10;
            result/=10;
        }

        return number==revese;
    }
}
