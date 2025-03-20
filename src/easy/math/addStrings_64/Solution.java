package easy.math.addStrings_64;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder1=new StringBuilder();
        if(num1.length()>num2.length()){
            while (num1.length() != stringBuilder1.length()+num2.length()) {
                stringBuilder1.append("0");
            }

            num2=stringBuilder1.append(num2).toString();
        }else if(num1.length()<num2.length()){
            StringBuilder stringBuilder2=new StringBuilder();
            while (num2.length() != stringBuilder2.length()+num1.length()) {
                stringBuilder2.append("0");
            }

            num1=stringBuilder2.append(num1).toString();
        }
        StringBuilder stringBuilder=new StringBuilder();
        int endIndex=num1.length(),one=0;
        for(int i=endIndex-1;i>=0;i--){
            stringBuilder.append((num1.charAt(i)-'0'+num2.charAt(i)-'0'+one)%10);
            one=(num1.charAt(i)-'0'+num2.charAt(i)-'0'+one)/10;
        }
        if(one>0){
            stringBuilder.append("1");
        }

        return stringBuilder.reverse().toString();

    }

}
