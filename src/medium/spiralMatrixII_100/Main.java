package medium.spiralMatrixII_100;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] matrix=solution.generateMatrix(3);
        for(int[] row:matrix){
            for(int colum:row){
                System.out.print(colum+" ");
            }
            System.out.println();
        }

    }
}
