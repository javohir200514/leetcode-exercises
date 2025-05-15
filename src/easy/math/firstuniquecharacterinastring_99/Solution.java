package easy.math.firstuniquecharacterinastring_99;

public class Solution {
    public int firstUniqChar(String s) {
        int[] num=new int[26];
        char[] charArr=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            num[charArr[i]-'a']++;
        }
        int j=0;
        for (int i = 0; i < charArr.length; i++) {
            if(num[charArr[i]-'a']==1) return i;;
        }
        return -1;
    }
}
