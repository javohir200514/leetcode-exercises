package easy.math.selfdividingnumbers_100;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> num=new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if(divede(i)){
                num.add(i);
            }
        }
        return num;
    }
    boolean divede(int n){
        if(n<10) return true;
        int num=n;
        while (n!=0){
            if(n%10==0) return false;
            if(num%(n%10)!=0) return false;
            n/=10;
        }
        return true;
    }
}
