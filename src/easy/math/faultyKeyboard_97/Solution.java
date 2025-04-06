package easy.math.faultyKeyboard_97;

public class Solution {
    public String finalString(String s) {
        StringBuilder newS=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='i'){
                newS.reverse();
            }else newS.append(s.charAt(i));
        }
        return newS.toString();
    }
}
