package easy.math.dayOfTheYear_94;

public class Solution {
    public int dayOfYear(String date) {
        int year=Integer.valueOf(date.substring(0,4));
        int month=Integer.valueOf(date.substring(5,7));

        int day=Integer.valueOf(date.substring(8,10));
        int febday;
        if(year%4==0&&year%100!=0||year%400==0){
            febday=29;
        }else{
            febday=28;
        }
        int[] days={31,febday,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        for (int i=0;i<month-1;i++){
            sum+=days[i];
        }
        return sum+day;
    }
}
