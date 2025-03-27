package easy.math.lengthOfLastWord_100;

public class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i)==' ') {
                count++;
            }else{
                break;
            }
        }
        int count1=0;
        for (int i = s.length() - 1-count; i >=0 ; i--) {
            if(s.charAt(i)!=' '){
                count1++;
            }else{
                break;
            }
        }
        return count1;
    }
}
