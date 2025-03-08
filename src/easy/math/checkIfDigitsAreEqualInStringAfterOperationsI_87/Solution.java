package easy.math.checkIfDigitsAreEqualInStringAfterOperationsI_87;

public class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb=new StringBuilder();
        while(s.length()!=2){

            for(int i=1;i<s.length();i++){
                sb.append(((s.charAt(i-1)-'0')+(s.charAt(i)-'0'))%10);
            }
            s = sb.toString();
            sb.delete(0, sb.length());
        }
        return s.charAt(0)==s.charAt(1);
    }
}
