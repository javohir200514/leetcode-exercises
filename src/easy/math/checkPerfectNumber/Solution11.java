package easy.math.checkPerfectNumber;

public class Solution11 {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        boolean a;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
            if(sum==num) a=true;
            else a=false;
            return a;
    }
}
