package easy.math.uniquemorsecodewords_96;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set=new HashSet<>();
        String[] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count=words.length;
        for (int i = 0; i < words.length; i++) {
            StringBuilder codes=new StringBuilder();
            char[] charwords=words[i].toCharArray();
            for (int j = 0; j < charwords.length; j++) {
                codes.append(code[charwords[i]-'a']);
            }
            set.add(codes.toString());
        }
        return set.size();
    }
}
