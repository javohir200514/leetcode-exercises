package easy.math.thetwosneakynumbersofdigitville_100;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] a={0,3,2,1,3,2};
        System.out.println(Arrays.toString(solution.getSneakyNumbers(a)));
    }
}
