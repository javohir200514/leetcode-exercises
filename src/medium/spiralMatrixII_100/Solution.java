package medium.spiralMatrixII_100;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] array=new int[n][n];
        int left=0,right=n,top=0,low=n;
        int i=0,j=0,count=1;
        while(count<=n*n){
            while(j<right){
                array[i][j]=count++;
                j++;

            }
            i++;
            j--;
            while(i<low){
                array[i][j]=count++;
                i++;

            }
            i--;
            j--;
            while(j>=left){
                array[i][j]=count++;
                j--;

            }
            j++;
            i--;
            while(i>top){
                array[i][j]=count++;
                i--;

            }
            i++;
            j++;
            top++;
            low--;
            left++;
            right--;
        }
        return array;
    }
}
