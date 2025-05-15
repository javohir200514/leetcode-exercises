package easy.math.sortingthesentence_100;

public class Solution {
    public String sortSentence(String s) {
        String[] strs=s.split(" ");
        String[] newstr=new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            newstr[strs[i].charAt(strs[i].length()-1)-'0'-1]=strs[i].substring(0,strs[i].length()-1);
        }
        return String.join(" ", newstr);
    }
}
