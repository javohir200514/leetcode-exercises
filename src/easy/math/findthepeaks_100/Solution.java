package easy.math.findthepeaks_100;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maximumStrongPairXor(int[] nums) {

        int max=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums.length; j++) {
                int a=nums[i],b=nums[j];
                if(Math.abs(a-b)<Math.min(a,b)){
                    max=Math.max(max,nums[i]^nums[j]);
                }
            }
        }
        return max;
    }
}
