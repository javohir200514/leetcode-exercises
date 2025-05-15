package easy.math.dayoftheweek_100;

public class Solution {
    public  String dayOfTheWeek(int day, int month, int year) {
        String[] week={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] monthdays={31,28,31,30,31,30,31,31,30,31,30,31};
        if(leapyear(year)){
            monthdays[1]=29;
        }
        int totolday=0;
        for (int i = 1971; i <year; i++) {
            if(leapyear(i)){
                totolday+=366;
            }else {
                totolday+=365;
            }
        }
        for (int i = 0; i < month-1; i++) {
            totolday+=monthdays[i];
        }
        totolday+=day;
        return week[(totolday+4)%7];

    }
    boolean leapyear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            return true;
        }
        return false;
    }
}
