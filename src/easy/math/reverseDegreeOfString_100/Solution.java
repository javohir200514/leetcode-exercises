package easy.math.reverseDegreeOfString_100;

public class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum+=(26-((int)s.charAt(i)-97))*(i+1);

        }
        return sum;
    }
}
