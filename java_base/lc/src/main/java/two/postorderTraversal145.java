package two;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-31 07:51
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class postorderTraversal145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode tempNode = root;
        while (!stack.isEmpty() || tempNode != null) {
            while (tempNode != null) {
                stack.add(tempNode);
                result.addFirst(tempNode.val);
                tempNode = tempNode.right;
            }
            TreeNode cur = stack.pop();

            if (cur.left != null) {
                tempNode = cur.left;
            }
        }
        return result;
    }


}
