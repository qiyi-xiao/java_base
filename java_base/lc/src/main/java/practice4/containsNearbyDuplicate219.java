package practice4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-19 22:58
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class containsNearbyDuplicate219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);

            if (index != null && i - index <= k) {
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }




}
