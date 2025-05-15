package easy.math.findallnumbersdisappearedinanarray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> num=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int k =1;
        for (int j = 0; j < nums.length; j++) {
            set.add(nums[j]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(k++)){
                num.add(k-1);
            }
        }
        return num;
    }
}
