package easy.math.convert1dArrayInto2dArray_58;

public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] matrix=new int[m][n];
        if(m==1&&original.length==n){
            for(int i=0;i<original.length;i++){
                matrix[0][i]=original[i];
            }
            return matrix;
        }

        int temp=0;
        if(original.length==m*n){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=original[temp];
                    temp++;
                }
            }
        }else{
            return new int[0][0];
        }
        return matrix;
    }
}
