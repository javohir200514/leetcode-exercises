package easy.math.countthenumberofvowelstringsinrange_100;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findPeaks(int[] mountain) {

        List<Integer> list=new ArrayList<>();
        for (int i = 1; i < mountain.length-1; i++) {
            if(mountain[i-1]<mountain[i]&&mountain[i+1]<mountain[i]){
                list.add(i);
            }
        }
        return list;
    }
}
