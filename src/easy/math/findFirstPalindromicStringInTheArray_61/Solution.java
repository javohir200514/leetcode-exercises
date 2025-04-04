package easy.math.findFirstPalindromicStringInTheArray_61;

public class Solution {
    public String firstPalindrome(String[] words) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length()/2; j++) {
                if(words[i].charAt(j)!=words[i].charAt(words[i].length()-1-j)){
                    break;
                }else {
                    count++;
                }
            }
            if(count==words[i].length()/2){
                return words[i];
            }
            count=0;
        }
        return "";
    }
}
