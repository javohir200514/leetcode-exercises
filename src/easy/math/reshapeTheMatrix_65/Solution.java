package easy.math.reshapeTheMatrix_65;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int[] longArray=new int[r*c];
        int a=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                longArray[a]=mat[i][j];
                a++;
            }
        }
        a=0;
        int[][] b=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=longArray[a++];

            }
        }
        return b;
    }
}
