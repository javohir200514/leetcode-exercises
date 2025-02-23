package easy.math.diogonalSum_100;

public class Main {
    public static void main(String[] args) {
        Solution12 solution=new Solution12();
        int[][] arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println(solution.diagonalSum(arr));
    }
}
