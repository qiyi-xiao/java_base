package practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-15 17:41
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class subsets78 {

    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null) {
            return result;
        }
        Arrays.sort(nums);
        backTrace(nums, new ArrayList<Integer>(), 0);
        return result;
    }

    private void backTrace(int[] nums, ArrayList<Integer> list, int curIndex) {
        result.add(new ArrayList<>(list));
        Set<Integer> set = new HashSet<>();
        for (int i = curIndex; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
//            if (list.contains(nums[i])){
//                continue;
//            }
//            if (i != 0 && nums[i] == nums[i - 1]){
//                continue;
//            }
            list.add(nums[i]);
            backTrace(nums, list, i + 1);
            list.remove(list.size() - 1);
        }
    }

}
