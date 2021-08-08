package practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-01 23:52
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class combinationSum39 {

    public static void main(String[] args) {
        List<List<Integer>> lists = combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(lists);
    }

    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
            return result;
        }

        backTrace(candidates, target, 0, new ArrayList<Integer>());
        return result;

    }

    private static void backTrace(int[] candidates, int target, int index, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            backTrace(candidates, target - candidates[i], i + 1, list);
            list.remove(list.size() - 1);
        }
    }

}
