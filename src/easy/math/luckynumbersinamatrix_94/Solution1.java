package easy.math.luckynumbersinamatrix_94;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,index=0;
            boolean a=false;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            for (int j = 0; j <matrix.length ; j++) {
                if(matrix[j][index]<=min){
                    a=true;
                }else{
                    a=false;
                    break;
                }
            }
            if(a) lucky.add(min);
        }
        return lucky;
    }
}
