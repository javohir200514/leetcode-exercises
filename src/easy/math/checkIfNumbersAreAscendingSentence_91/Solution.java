package easy.math.checkIfNumbersAreAscendingSentence_91;

public class Solution {
    public boolean areNumbersAscending(String s) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <s.length() ; i++) {
            if(i!=s.length()-1&&Character.isDigit(s.charAt(i))&&Character.isDigit(s.charAt(i+1))){
                if((s.charAt(i)-'0')*10+s.charAt(i+1)-'0'>max){
                    max=(s.charAt(i)-'0')*10+s.charAt(i+1)-'0';
                }else {
                    return false;
                }
                i++;
            }else if(Character.isDigit(s.charAt(i))){
                if(s.charAt(i)-'0'>max){
                    max=s.charAt(i)-'0';
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
