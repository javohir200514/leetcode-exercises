package easy.math.totalDistanceTraveled_100;

public class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank<5){
            return mainTank*10;
        }
        int sum=0;
        while(mainTank>4&&additionalTank!=0){
            mainTank-=5;
            sum+=5;
            mainTank++;
            additionalTank--;
        }
        return (sum+mainTank)*10 ;



    }
}
