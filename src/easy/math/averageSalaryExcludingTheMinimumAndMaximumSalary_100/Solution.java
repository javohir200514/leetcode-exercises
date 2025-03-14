package easy.math.averageSalaryExcludingTheMinimumAndMaximumSalary_100;

public class Solution {
    public  double average(int[] salary) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
            }
            if(max<salary[i]){
                max=salary[i];
            }
        }
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
        }
        double result=((double) (sum-min-max)/(salary.length-2));

        return result;
    }
}
