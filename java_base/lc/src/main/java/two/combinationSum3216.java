package two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-12 13:54
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class combinationSum3216 {


    public static void main(String[] args) {
        List<List<Integer>> lists = combinationSum3(3, 7);
        System.out.println(lists);
    }

    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int n) {

        backTrace(new ArrayList<Integer>(), 1, n, k);
        return result;
    }

    private static void backTrace(ArrayList<Integer> list, int index, int remainSum, int k) {
        if (remainSum < index && remainSum != 0){
            return;
        }
        if (list.size() == k){
            if (remainSum == 0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = index; i <= 9; i++) {
            list.add(i);
            backTrace(list, i + 1, remainSum - i, k);
            list.remove(list.size() - 1);
        }
    }

}
