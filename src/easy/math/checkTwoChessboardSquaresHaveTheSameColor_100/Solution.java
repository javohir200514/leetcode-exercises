package easy.math.checkTwoChessboardSquaresHaveTheSameColor_100;

public class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int cor1=0,cor2=0;
        if(coordinate1.charAt(0)=='a'||coordinate1.charAt(0)=='c'||coordinate1.charAt(0)=='e'||coordinate1.charAt(0)=='g'){
            if(coordinate1.charAt(1)%2!=0){
                cor1=1;
            }
        }else {
            if(coordinate1.charAt(1)%2==0){
                cor1=1;
            }
        }
        if(coordinate2.charAt(0)=='a'||coordinate2.charAt(0)=='c'||coordinate2.charAt(0)=='e'||coordinate2.charAt(0)=='g'){
            if(coordinate2.charAt(1)%2!=0){
                cor2=1;
            }
        }else {
            if(coordinate2.charAt(1)%2==0){
                cor2=1;
            }
        }
        return cor1==cor2;
    }
}
