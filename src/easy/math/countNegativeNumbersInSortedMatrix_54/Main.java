package easy.math.countNegativeNumbersInSortedMatrix_54;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] grad={
                {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}
        };
        System.out.println(solution.countNegatives(grad));
    }

}
