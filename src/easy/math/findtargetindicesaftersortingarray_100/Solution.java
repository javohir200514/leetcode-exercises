package easy.math.findtargetindicesaftersortingarray_100;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0,little=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target) count++;
            else if(nums[i]<target) little++;

        }
        List<Integer> index=new ArrayList<>();
        for (int i = little; i < little+count; i++) {
            index.add(i);
        }
        return index;
    }
}
