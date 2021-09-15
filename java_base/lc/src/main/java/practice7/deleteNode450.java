package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-29 21:51
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class deleteNode450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            TreeNode replace = replace(root);
            if (replace == null) {
                return null;
            }
        }
        if (root.left != null && root.left.val == key && root.left.left == null && root.right.right == null) {
            root.left = null;
            return root;
        }
        if (root.right != null && root.right.val == key && root.right.left == null && root.right.right == null) {
            root.right = null;
            return root;
        }

        deleteNode(root.left, key);
        deleteNode(root.right, key);
        return root;
    }

    private TreeNode replace(TreeNode root) {
        if (root.left == null && root.right == null) {
            return null;
        }
        TreeNode cur;
        if (root.left != null) {
            TreeNode preNode = root;
            cur = root.left;
            while (cur.right != null) {
                preNode = cur;
                cur = cur.right;
            }
            root.val = cur.val;
            if (cur.left != null) {
                replace(cur);
            }else {
                if (preNode == root) {
                    preNode.left = null;
                }else {
                    preNode.right = null;
                }
            }
        } else {
            TreeNode preNode = root;
            cur = root.right;
            while (cur.left != null) {
                preNode = cur;
                cur = cur.left;
            }
            root.val = cur.val;
            if (cur.right != null) {
                replace(cur);
            }else {
                if (preNode == root) {
                    preNode.left = null;
                }else {
                    preNode.right = null;
                }
            }
        }
        return root;
    }


}
