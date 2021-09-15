package two;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-19 23:52
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class inorderTraversal94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode tempNode = root;
        while (!stack.isEmpty() || tempNode != null) {
            while (tempNode != null) {
                stack.push(tempNode);
                tempNode = tempNode.left;
            }

            TreeNode cur = stack.pop();
            result.add(cur.val);
            if (cur.right != null) {
                tempNode = cur.right;
            }
        }
        return result;
    }


}
