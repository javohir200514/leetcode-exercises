package easy.math.convertTemperature_100;

import java.util.Arrays;

import static easy.math.convertTemperature_100.Solution.convertTemperature;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        double[] a=convertTemperature(36.50);
        System.out.println(Arrays.toString(a));
    }
}
