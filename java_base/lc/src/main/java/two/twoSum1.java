package two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-29 11:09
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class twoSum1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            }else {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        return result;
    }

}
