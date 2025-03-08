package easy.math.hammingDistance_100;

public class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(true){
            if(x%2!=y%2){
                count++;
            }
            x/=2;
            y/=2;
            if(x==0&&y==0){
                break;
            }
        }
        return count;
    }
}
