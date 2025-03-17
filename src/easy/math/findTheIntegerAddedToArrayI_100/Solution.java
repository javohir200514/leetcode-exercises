package easy.math.findTheIntegerAddedToArrayI_100;

public class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(min1>nums1[i]){
                min1=nums1[i];
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(min2>nums2[i]){
                min2=nums2[i];
            }
        }
        if(min1<min2) return min2-min1;
        return min2-min1;
    }
}
