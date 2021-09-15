package zjfk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-05 18:18
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class pathSum113 {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return result;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(Arrays.asList(targetSum));
            return result;
        }
        if (root.left != null) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.val);
            subPathSum(root.left, targetSum - root.val, list);
        }
        if (root.right != null) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.val);
            subPathSum(root.right, targetSum - root.val, list);
        }
        return result;
    }

    private void subPathSum(TreeNode node, int sum, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null && sum == node.val) {
            list.add(node.val);
            result.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }

        if (node.left != null) {
            list.add(node.val);
            subPathSum(node.left, sum - node.val, list);
            list.remove(list.size() - 1);
        }

        if (node.right != null) {
            list.add(node.val);
            subPathSum(node.right, sum - node.val, list);
            list.remove(list.size() - 1);
        }
    }


}
