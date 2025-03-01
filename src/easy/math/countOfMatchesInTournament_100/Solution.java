package easy.math.countOfMatchesInTournament_100;

public class Solution {
    public int numberOfMatches(int n) {
        if(n==1)return 0;
        int sum=0,newN=n;
        while(n!=1){
            newN=n;
            sum+=n/2;
            n/=2;
            n=newN-n;

        }
        return sum;
    }
}
