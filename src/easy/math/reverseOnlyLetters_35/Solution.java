package easy.math.reverseOnlyLetters_35;

import static java.lang.Character.isLetter;
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(isLetter(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }


        }
        StringBuilder stringBuilder1=new StringBuilder();
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if(isLetter(s.charAt(i))){
                stringBuilder1.append(stringBuilder.charAt(j));
                j++;
            }else{
                stringBuilder1.append(s.charAt(i));
            }
        }
        return stringBuilder1.toString();
    }
}
