package easy.math.maximumnumberofwordsfoundinsentences_96;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String s: sentences){
            int count = 0;
            char[] arr = s.toCharArray();
            for(int i = 0; i<arr.length; i++){
                if(arr[i]==' '){
                    count++;
                }
            }
            if(count>ans){
                ans = count;
            }
        }
        return ans+1;
    }
}
