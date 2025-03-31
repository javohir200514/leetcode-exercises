package easy.math.decompressRunLengthEncodedList_66;

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length=0;
        for (int i = 0; i < nums.length; i+=2) {
            length+=nums[i];
        }
        int[] a=new int[length];
        int count=0;
        for (int i = 0; i <nums.length/2 ; i++) {
            for (int j = 0; j < nums[2*i]; j++) {
                a[count++]=nums[2*i+1];
            }
        }
        return a;
    }
}
