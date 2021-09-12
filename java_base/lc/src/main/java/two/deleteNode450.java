package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-03 06:46
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class deleteNode450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        deleteTreeNode(root, key);
        return root;
    }

    private void deleteTreeNode(TreeNode root, int key) {
        if (root == null) {
            return;
        }
        if (root.val == key) {
            int subVal = searchAndRemoveSubNode(root, key);
        }




    }

    private int searchAndRemoveSubNode(TreeNode root, int key) {
        if (root.left == null && root.right == null) {
            return root.val;
        }

        if (root.left != null) {
            return searchAndRemoveSubNode(root.left, key);
        }
        if (root.right != null){
            return searchAndRemoveSubNode(root.right, key);
        }

        return 0;
    }


}
