package practice7;

import practice6.TreeNode;

import javax.validation.constraints.Max;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-27 23:00
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class maxDepth104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(maxDepth(root.left ), maxDepth(root.right)) + 1;
    }

}
