package practice7;

import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-29 07:03
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class pathSum473 {


    int num = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        pathCount(root, targetSum, 0);
        return num;
    }

    private void pathCount(TreeNode root, int targetSum, int type) {
        if (root == null) {
            return;
        }
        if (type > 0 && targetSum - root.val == 0) {
            num++;
            return;
        }
        if (type == 1 && root.left != null){
            pathCount(root.left, targetSum - root.val, 1);
        }
        if (type == 2 && root.right != null) {
            pathCount(root.right, targetSum - root.val, 2);
        }
        if (type == 0) {
            pathCount(root.right, targetSum, 0);
            if (root.right != null && root.right.val == targetSum) {
                num++;
                return;
            }else {
                pathCount(root.right, targetSum, 1);
                pathCount(root.right, targetSum, 2);
            }
            pathCount(root.left, targetSum, 0);
            if (root.left != null && root.left.val == targetSum) {
                num++;
                return;
            }else {
                pathCount(root.left, targetSum, 1);
                pathCount(root.left, targetSum, 2);
            }
        }
    }

}
