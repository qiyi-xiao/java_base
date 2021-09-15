package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-29 07:03
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class pathSum437 {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(-2);
        TreeNode node2 = new TreeNode(-3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(-2);
        TreeNode node6 = new TreeNode(-1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node3.left = node6;
        pathSum(root, -1);
    }

    static int num = 0;
    public static int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            num++;
            return num;
        }
        if (targetSum == root.val) {
            num++;
        }

        path(root.left, targetSum, 0);
        path(root.right, targetSum, 0);
        path(root.left, targetSum - root.val, 1);
        path(root.right, targetSum - root.val, 1);
        System.out.println(num);
        return num;
    }

    public static int path(TreeNode root, int targetSum, int type) {
        if (root == null) {
            return 0;
        }
        if (targetSum - root.val == 0) {
            num++;
            System.out.println(root.val);
        }

        if (type == 0) {
            path(root.left, targetSum, 0);
            path(root.right, targetSum, 0);
            path(root.left, targetSum - root.val, 1);
            path(root.right, targetSum - root.val, 1);
        }else {
            path(root.left, targetSum - root.val, 1);
            path(root.right, targetSum - root.val, 1);
        }

        return num;
    }

}
