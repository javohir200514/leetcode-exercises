package easy.math.reversePrefixOfWord_100;

public class Solution {
    public String reversePrefix(String word, char ch) {
        int index=0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        StringBuilder s=new StringBuilder();
        s.append(word.substring(0,index+1));
        s.reverse().append(word.substring(index+1));

        return s.toString();
    }
}
