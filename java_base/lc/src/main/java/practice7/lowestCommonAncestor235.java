package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-29 22:30
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class lowestCommonAncestor235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val >= Math.min(p.val, q.val) && root.val <= Math.max(p.val, q.val)){
            return root;
        }
        if (root.val < Math.min(p.val, q.val)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > Math.max(p.val, q.val)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return null;
    }

}
