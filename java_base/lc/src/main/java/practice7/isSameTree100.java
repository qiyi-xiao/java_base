package practice7;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 06:45
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isSameTree100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


}
