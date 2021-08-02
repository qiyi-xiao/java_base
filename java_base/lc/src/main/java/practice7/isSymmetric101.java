package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 06:54
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isSymmetric101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }
        return isSameNode(root.left, root.right);
    }

    public boolean isSameNode(TreeNode left, TreeNode right){
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSameNode(left.left, right.right) && isSameNode(left.right, right.left);
    }


}
