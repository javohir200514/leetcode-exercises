package easy.math.distringmatch_99;

public class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] res=new int[n+1];
        int k=n,j=0,index=0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='I') res[index++]=j++;
            else res[index++]=k--;
        }
        res[index]=k;
        return res;
    }
}
