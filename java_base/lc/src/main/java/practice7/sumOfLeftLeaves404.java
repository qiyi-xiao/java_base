package practice7;

import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 07:41
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class sumOfLeftLeaves404 {

    public int sumOfLeftLeaves1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                if (cur.left != null && cur.left.left == null && cur.left.right == null) {
                    sum = sum + cur.left.val;
                }
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode node = stack.pop();
            if (node.right != null) {
                cur = node.right;
            }
        }
        return sum;
    }

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = sum + root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }


}
