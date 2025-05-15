package easy.math.determinecolorofachessboardsquare_100;

public class Solution {
    public boolean squareIsWhite(String coordinates) {
        int number=coordinates.charAt(1);
        char ch=coordinates.charAt(0);
        if(ch=='a'||ch=='c'||ch=='e'||ch=='g'){
            if(number%2==0) return true;
            else return false;
        }else {
            if(number%2==0) return false;
            else return true;
        }
    }
}
