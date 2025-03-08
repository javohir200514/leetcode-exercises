package easy.math.reverseString_25;

public class Solution {
    public char[] reverseString(char[] s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            sb.append(s[i]);
            s[i]=sb.charAt(i);
        }
        return s;
    }
}
