package easy.math.search2dMatrix_100;


public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] matrix=new int[3][4];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println(solution.searchMatrix(matrix,13));
    }
}
