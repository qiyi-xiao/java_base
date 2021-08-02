package practice4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-18 19:27
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class intersect350 {


    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        int sum = 0;
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.getOrDefault(nums2[i], 0) > 0) {
                map.put(nums2[i],map.get(nums2[i]) - 1);
                result.put(nums2[i], result.getOrDefault(nums2[i],0) + 1);
                sum++;
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = result.entrySet();

        int[] ints = new int[sum];
        int i = 0;
        for (Map.Entry<Integer, Integer> m: entries) {
            Integer key = m.getKey();
            Integer value = m.getValue();
            for (int j = 0; j < value; j++) {
                ints[i++] = key;
            }
        }
        return ints;
    }

}
