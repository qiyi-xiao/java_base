package practice8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-29 23:21
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class permute46 {


    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
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
        for (int num : nums) {
            if (list.contains(num)) {
                continue;
            }
            list.add(num);
            backTrace(nums, index + 1, list);
            list.remove(index);
        }
    }


}
