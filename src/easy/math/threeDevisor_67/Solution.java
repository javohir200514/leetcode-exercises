package easy.math.threeDevisor_67;

public class Solution {
    public boolean isThree(int n) {
        if(n<0)return false;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==3) return true;
        else return false;
    }
}
