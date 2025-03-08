package easy.math.countingBits;

public class Solution {
    public int[] countBits(int n) {

        int[] array=new int[n+1];
        int i=0,count=0,temp=0;
        while(true){
            i=temp;
            while(i!=0){
                if(i%2!=0){
                    count++;
                }
                i/=2;
            }
            array[temp]=count;
            temp++;
            count=0;
            if(temp==n+1){
                break;
            }
        }
        return array;

    }
}
