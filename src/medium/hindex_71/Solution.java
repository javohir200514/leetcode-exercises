package medium.hindex_71;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        int max=Integer.MIN_VALUE,h=0,n=citations.length;
        Arrays.sort(citations);
        for (int i = citations.length-1; i>=0; i--) {
            if(citations[i]>=n-i){
                h=n-i;
            }else{
                break;
            }
        }
        return h;
    }
}
