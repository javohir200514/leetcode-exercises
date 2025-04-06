package easy.math.numberofbitchangestomaketwointegersequal_100;

public class Solution {
    public static int minChanges(int n, int k) {
        if(n==k) return 0;

        int i=0;
        int count=0,j=0;
        while (n!=0||k!=0){
            if(n%2==1&&k%2==0){
                count++;
                j++;
            }else if(n%2==k%2) {
                j++;
            }
            n/=2;
            k/=2;
            i++;
        }
        if(j==i){
            return count;
        }
        return -1;
    }
}
