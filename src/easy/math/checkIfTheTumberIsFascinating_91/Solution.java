package easy.math.checkIfTheTumberIsFascinating_91;

import java.util.Arrays;

public class Solution {
    public boolean isFascinating(int n) {
        int[] array=new int[9];
        int c=2*n,d=3*n;
        if(c>999||d>999){
            return false;
        }
        for (int i = 0; i < 3; i++) {
            array[i]= n %10;
            array[i+3]=c%10;
            array[i+6]=d%10;
            if(array[i]==0||array[i+3]==0||array[i+6]==0){
                return false;
            }
            n/=10;
            c/=10;
            d/=10;
        }
        Arrays.sort(array);
        for (int i = 1; i < 9; i++) {
            if(array[i-1]==array[i]){
                return false;
            }
        }
        return true;
    }
}
