package easy.math.validmountainarray_100;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3) return false;

        int max=arr[0],index=0;
        for (int i = 0; i < n; i++) {
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        boolean a=false,b=false;
        for (int i = 0; i <index; i++) {
            a=true;
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }

        for (int i = index; i<n-1; i++) {

            b=true;
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }

        return a&&b;
    }
}
