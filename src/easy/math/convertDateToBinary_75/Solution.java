package easy.math.convertDateToBinary_75;

public class Solution {
    public String convertDateToBinary(String date) {
        int year=Integer.valueOf(date.substring(0,4));
        int month=Integer.valueOf(date.substring(5,7));
        int day=Integer.valueOf(date.substring(8,10));
        StringBuilder s=new StringBuilder();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        while (year!=0){
            s.append(year%2);
            year/=2;
        }
        while (month!=0){
            s1.append(month%2);
            month/=2;
        }
        while (day!=0){
            s2.append(day%2);
            day/=2;
        }
        s.reverse();
        s1.reverse();
        s2.reverse();
        s.append("-").append(s1).append("-").append(s2);
        return s.toString();
    }
}
