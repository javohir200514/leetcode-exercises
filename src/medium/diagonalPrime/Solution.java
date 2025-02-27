package medium.diagonalPrime;

public class Solution {
    public static int diagonalPrime(int[][] nums) {
        int large=0;
        for(int i=0;i<nums[0].length;i++){
            if(primeNumber(nums[i][i])){
                if(large<nums[i][i]){
                    large=nums[i][i];
                }
            }
            if(primeNumber(nums[i][nums[0].length-i-1])){
                if(large<nums[i][nums[0].length-i-1]){
                    large=nums[i][nums[0].length-i-1];
                }
            }
        }
        return large;
    }
    public static boolean primeNumber(int a){
        if (a <= 1){
            return false;
        }
        if (a <= 3){
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0){
            return false;
        }
        int count=0;
        for(int i=5;i*i<=a;i++){
            if (a% i == 0 || a% (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
