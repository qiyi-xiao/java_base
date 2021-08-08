package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 22:40
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class sumNumbers129 {

    int num = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sumNum(root, 0);
        return num;
    }

    private void sumNum(TreeNode root, int curNum) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            num = num + curNum * 10 + root.val;
            return;
        }
        sumNum(root.left, curNum * 10 + root.val);
        sumNum(root.right, curNum * 10 + root.val);
    }

}
