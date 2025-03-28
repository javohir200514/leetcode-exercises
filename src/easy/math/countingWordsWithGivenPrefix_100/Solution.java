package easy.math.countingWordsWithGivenPrefix_100;

public class Solution {
    public int prefixCount(String[] words, String pref) {
        int length=pref.length(),count=0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()<length){
                continue;
            }
            if(words[i].startsWith(pref)){
                count++;
            }
        }

        return count;
    }
}
