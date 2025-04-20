package easy.math.reformatdate_98;

public class Solution {
    public String reformatDate(String date) {
        StringBuilder dateString=new StringBuilder();
        dateString.append(date.substring(date.length()-4)).append("-");
        String[] month={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < month.length; i++) {
            if(date.substring(date.length()-8,date.length()-8+3).equals(month[i])){
                if(i<=8)dateString.append("0").append(i+1).append("-");
                else dateString.append(i+1).append("-");
            }
        }
        int count=0;
        for (int i = 0; i < date.length(); i++) {
            if((date.charAt(i)>='0'&&date.charAt(i)<='9')){
                count++;
            }else{
                break;
            }
        }
        if(count==1){
            dateString.append("0").append(date.charAt(0));
        }else dateString.append(date, 0, 2);
        return dateString.toString();
    }
}
