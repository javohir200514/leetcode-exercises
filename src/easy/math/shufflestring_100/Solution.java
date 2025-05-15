package easy.math.shufflestring_100;

public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] snew=s.toCharArray();
        char[] result=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            result[indices[i]]=snew[i];
        }
        return String.valueOf(result);
    }
}
