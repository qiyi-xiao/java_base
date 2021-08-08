package practice8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-01 21:53
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class combine77 {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if (k > n) {
            return result;
        }

        backTrace(n, 1, 0, new ArrayList<>(), k);
        return result;
    }

    private void backTrace(int n, int index, int count, List<Integer> list, int k) {
        if (count == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= n; i++) {
            list.add(i);
            backTrace(n, i + 1, count + 1, list, k);
            list.remove(list.size() - 1);
        }
    }


}
