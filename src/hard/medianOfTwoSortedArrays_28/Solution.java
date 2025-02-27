package hard.medianOfTwoSortedArrays_28;

import java.util.Arrays;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            array[i]=nums1[i];

        }
        for(int i=0;i<nums2.length;i++){
            array[i+nums1.length]=nums2[i];
        }
        Arrays.sort(array);
        if(array.length%2==0){
            return (double)((array[array.length/2]+array[array.length/2-1])/2.0);
        }else{
            return array[array.length/2];
        }
    }
}
