package practice7;


/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 06:41
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class invertTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }

}
