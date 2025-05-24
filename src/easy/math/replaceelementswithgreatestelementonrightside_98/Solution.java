package easy.math.replaceelementswithgreatestelementonrightside_98;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newarr=new int[arr.length];

        int max=arr[arr.length-1];
        for (int i = arr.length-1; i>=0 ; i--) {
            newarr[i]=max;
            if(arr[i]>max){
                max=arr[i];
            }
        }
        newarr[arr.length-1]=-1;
        return newarr;
    }
}
