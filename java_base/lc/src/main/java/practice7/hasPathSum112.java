package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 08:01
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class hasPathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }


}
