package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 07:22
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isBalanced110 {

    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        countTreeHigh(root);
        return result;
    }

    private int countTreeHigh(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int left = countTreeHigh(node.left);
        int right = countTreeHigh(node.right);
        if (Math.abs(left - right) > 1) {
            result = false;
            return -1;
        }
        return Math.max(left, right) + 1;
    }


}
