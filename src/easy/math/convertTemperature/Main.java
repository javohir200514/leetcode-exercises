package easy.math.convertTemperature;

import java.util.Arrays;

import static easy.math.convertTemperature.Solution.convertTemperature;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        double[] a=convertTemperature(36.50);
        System.out.println(Arrays.toString(a));
    }
}
