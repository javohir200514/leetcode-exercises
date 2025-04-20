package easy.math.validword_99;

public class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int wovel=0,consonant=0;
        for (int i = 0; i < word.length(); i++) {
            if('0'>word.charAt(i)||word.charAt(i)>'9'&&'A'>word.charAt(i)||'Z'<word.charAt(i)&&'a'>word.charAt(i)||word.charAt(i)>'z'){
                return false;
            }else if(word.charAt(i)=='a'||word.charAt(i)== 'e'||word.charAt(i)== 'i'||word.charAt(i)== 'o'||word.charAt(i)== 'u'||
                    word.charAt(i)=='A'||word.charAt(i)== 'E'||word.charAt(i)== 'I'||word.charAt(i)== 'O'||word.charAt(i)== 'U'
            ){
                wovel++;
            }else if('a'<=word.charAt(i)&&word.charAt(i)<='z'||'A'<=word.charAt(i)&&word.charAt(i)<='Z'){
                consonant++;
            }
        }
        return wovel>=1&&consonant>=1;
    }
}
