package easy.math.xorOperationInAnArray_100;

public class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum^=start;
            start+=2;
        }
        return sum;
    }
}
