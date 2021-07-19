package practice4;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-18 14:28
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class intersection349 {


    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        Set<Integer> setNum2 = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            setNum2.add(nums2[i]);
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            if (setNum2.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        int[] ints = new int[set.size()];
        int i = 0;
        for (Integer set1:set) {
            ints[i++] = set1;
        }
        return ints;
    }





}
