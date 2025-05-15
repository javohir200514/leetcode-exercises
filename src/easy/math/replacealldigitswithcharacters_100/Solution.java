package easy.math.replacealldigitswithcharacters_100;

import java.util.Arrays;

public class Solution {
    public String replaceDigits(String s) {
        char[] schar=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            if(i%2!=0) {
                schar[i]=shift(s.charAt(i-1),s.charAt(i));
            }
        }
        return String.valueOf(schar);
    }

    public char shift(char character,int a){
        return ((char)(character + a - '0'));
    }
}
