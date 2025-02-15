package easy.math.powerOfFour;

public class Solution5 {
    public boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        while(n!=0){

            if(n%4!=0&&n!=1){
                return false;
            }
            n/=4;
        }

        return true;
    }
}
