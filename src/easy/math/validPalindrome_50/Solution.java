package easy.math.validPalindrome_50;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isLetter(s.charAt(i))||isDigit(s.charAt(i))){
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        if(stringBuilder.toString().toLowerCase().equals(stringBuilder.reverse().toString())){
            return true;
        }
        return false;
    }
}