package easy.math.powerOfTwo;

public class Solution4 {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n!=0){

            if(n%2!=0&&n!=1){
                return false;
            }
            n/=2;
        }

        return true;
    }
}
