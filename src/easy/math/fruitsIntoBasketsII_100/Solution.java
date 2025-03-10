package easy.math.fruitsIntoBasketsII_100;

public class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        if(fruits.length==1&&baskets[0]==fruits[0]) return 0;
        int count=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<fruits.length;j++ )
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    count++;
                    break;
                }
        }
        return fruits.length-count;
    }
}
