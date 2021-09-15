package practice7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 20:46
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class pathSum113 {

    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return new ArrayList<>();
        }
        searchList(root, targetSum,new LinkedList<>());
        return result;
    }

    private void searchList(TreeNode root, int targetSum, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(list);
            return;
        }
        searchList(root.left, targetSum - root.val, new LinkedList<>(list));
        searchList(root.right, targetSum - root.val, new LinkedList<>(list));
    }

}
