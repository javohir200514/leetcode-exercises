package easy.math.powerOfThree;

public class Solution6 {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        while(n!=0){

            if(n%3!=0&&n!=1){
                return false;
            }
            n/=3;
        }

        return true;
    }
}
