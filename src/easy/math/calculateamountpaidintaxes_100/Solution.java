package easy.math.calculateamountpaidintaxes_100;

public class Solution {
    public double calculateTax(int[][] brackets, int income) {
        if(income==0){
            return 0;
        }
        if(brackets[0][0]>income){
            return income*brackets[0][1]/100.0;
        }
        double sum=brackets[0][0]*brackets[0][1]/100.0,total=brackets[0][0];
        for (int i = 1; i < brackets.length; i++) {

            double a=brackets[i][0]-brackets[i-1][0];
            if(total+a<income){
                total+=a;
                sum+=(a)*brackets[i][1]/100.0;
            }else   {
                sum+=(income-total)*brackets[i][1]/100.0;
                break;
            }
        }
        return sum;
    }
}
