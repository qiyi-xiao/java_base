package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-31 22:28
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class minDepth111 {


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(min, minDepth(root.left));
        }

        if (root.right != null) {
            min = Math.min(min, minDepth(root.right));
        }
        return min + 1;
    }

}
