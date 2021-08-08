package practice8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-29 23:35
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class permuteUnique47 {


    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null) {
            return lists;
        }

        backTrace(nums, 0, new ArrayList<>());
        return lists;
    }

    private void backTrace(int[] nums, int index, List<Integer> list) {
        if (index == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            list.add(nums[i]);
            swap(nums, i, index);
            backTrace(nums, index + 1, list);
            swap(nums, i, index);
            list.remove(index);
        }
    }

    private void swap(int[] nums, int i, int index) {
        int a = nums[i];
        nums[i] = nums[index];
        nums[index] = a;
    }


}
