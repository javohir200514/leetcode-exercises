package easy.math.containsduplicateii_100;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])&&(i-map.get(nums[i]))<=k){
                return true;
            }
            map.put(nums[i],i);

        }
        return false;
    }
}
