package easy.math.checkifstringisaprefixofarray_100;

public class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            str.append(words[i]);
            if(str.length() == s.length()&&str.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}
