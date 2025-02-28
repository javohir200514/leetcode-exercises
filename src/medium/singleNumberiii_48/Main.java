package medium.singleNumberiii_48;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] numa={1,1,0,-2147483648};
        System.out.println(Arrays.toString(solution.singleNumber(numa)));
    }
}
