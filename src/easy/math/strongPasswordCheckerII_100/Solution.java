package easy.math.strongPasswordCheckerII_100;

public class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        int lower=0,upper=0,digit=0,sign=0;
        for (int i = 0; i < password.length(); i++) {
            if (i!=password.length()-1&&password.charAt(i)==password.charAt(i+1)){
                return false;
            }
            if('0'<=password.charAt(i)&&'9'>=password.charAt(i)){
                digit++;
            }else if('a'<=password.charAt(i)&&password.charAt(i)<='z'){
                lower++;
            }else if ('A'<=password.charAt(i)&&password.charAt(i)<='Z'){
                upper++;
            }else {
                sign++;
            }
        }
        return digit>=1&&lower>=1&&upper>=1&&sign>=1;
    }
}
