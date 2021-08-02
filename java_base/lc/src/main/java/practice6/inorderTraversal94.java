package practice6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 19:33
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class inorderTraversal94 {

    LinkedList<Integer> list = new LinkedList<>();
    public List<Integer> inorderTraversal1(TreeNode root) {
        if (root == null) {
            return list;
        }

        inorderTraversal1(root.left);
        list.add(root.val);
        inorderTraversal1(root.right);
        return list;
    }



    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<Integer> list = new LinkedList<>();


        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode node = stack.pop();

            list.add(node.val);

            if (node.right != null) {
                cur = node.right;
            }
        }
        return list;
    }








}
