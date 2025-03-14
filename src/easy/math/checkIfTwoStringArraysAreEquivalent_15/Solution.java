package easy.math.checkIfTwoStringArraysAreEquivalent_15;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sb1="";
        String sb2="";

        for(int i=0;i<word1.length;i++){
            sb1.concat(word1[i]);
        }
        System.out.println(sb1.toString());

        for(int i=0;i<word2.length;i++){
            sb2.concat(word2[i]);
        }

        return sb1.equals(sb2);
    }
}
