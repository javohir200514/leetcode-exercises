package easy.math.findallnumbersdisappearedinanarray;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            count[num]++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }

}
