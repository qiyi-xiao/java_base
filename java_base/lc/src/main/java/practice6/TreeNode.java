package practice6;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 19:15
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
