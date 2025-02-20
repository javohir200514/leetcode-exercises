package easy.math.diogonalSum;

public class Solution12 {
    public int diagonalSum(int[][] mat) {
        int sum=0,j=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][j];
            sum+=mat[i][mat.length-1-i];
            j++;

        }
        if(mat.length%2!=0){
            return sum-mat[(mat.length)/2][mat.length/2];
        }else return sum;
    }
}
