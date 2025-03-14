package easy.math.kthMissingPositiveNumber_100;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0,a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=++count){
                i--;
                a++;
                if(a==k){
                    return count;
                }
            }
        }
        while(a!=k){
            a++;
            count++;
            if(a==k){
                return count;
            }
        }

        return 0;
    }
}
