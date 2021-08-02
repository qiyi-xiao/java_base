package practice6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 15:58
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class preorderTraversal144 {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        List<Integer> list = preorderTraversal1(root);
        System.out.println(list);
    }

    public static List<Integer> preorderTraversal1(TreeNode root) {

        if (root == null ){
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            return new LinkedList<Integer>(Collections.singleton(root.val));
        }


        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        LinkedList<Integer> result = new LinkedList<>();

        while (stack.size() != 0) {
            TreeNode treeNode = stack.pop();
            TreeNode leftNode = treeNode.left;
            TreeNode rightNode = treeNode.right;
            result.add(treeNode.val);
            if (rightNode != null) {
                stack.push(rightNode);
            }
            if (leftNode != null) {
                stack.push(leftNode);
            }
        }
        return result;
    }


    public static List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<Integer> list = new LinkedList<>();
        preorder(root, list);
        return list;
    }

    private static void preorder(TreeNode node, LinkedList<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<Integer> list = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {

            while (root != null) {
                stack.push(root);
                list.add(root.val);
                root = root.left;
            }
            TreeNode node = stack.pop();

            if (node.right != null) {
                root = node.right;
            }
        }
        return list;
    }


}
