package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 07:09
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class countNodes222 {

    int count = 0;
    public int countNodes(TreeNode root) {
        if (root == null) {
            return count;
        }
        count++;
        countNodes(root.left);
        countNodes(root.right);
        return count;
    }


}
