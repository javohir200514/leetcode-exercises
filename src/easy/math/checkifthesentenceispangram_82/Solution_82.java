package easy.math.checkifthesentenceispangram_82;

public class Solution_82 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        int[] alpha=new int[26];
        int count=0;
        for (int i = 0; i < sentence.length(); i++) {
            if(alpha[sentence.charAt(i)-'a']==0){
                alpha[sentence.charAt(i)-'a']++;
                count++;
                if (count == 26) return true;
            }
        }
        return false;
    }
}
