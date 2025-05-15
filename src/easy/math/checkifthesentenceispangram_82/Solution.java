package easy.math.checkifthesentenceispangram_82;

import java.util.HashSet;

public class Solution {

    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        HashSet<Character> set=new HashSet<>();
        int[] alpha=new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size()==26;
    }
}
