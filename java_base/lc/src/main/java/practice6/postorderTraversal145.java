package practice6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 20:29
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class postorderTraversal145 {


    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        LinkedList<Integer> list = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {

            while (cur != null) {
                stack.push(cur);
                list.addFirst(cur.val);
                cur = cur.right;
            }

            TreeNode node = stack.pop();

            if (node.left != null) {
                cur = node.left;
            }
        }
        return list;
    }


}
