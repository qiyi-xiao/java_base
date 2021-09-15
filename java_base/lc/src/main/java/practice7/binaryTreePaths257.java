package practice7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-28 22:48
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class binaryTreePaths257 {


    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left != null) {
            binary(root.left, root.val + "");
        }
        if (root.right != null) {
            binary(root.right, root.val + "");
        }
        return list;
    }

    private void binary(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            s = s + "->" + root.val;
            list.add(s);
            return;
        }
        if (root.left != null) {
            binary(root.left, s + "->" + root.val);
        }
        if (root.right != null) {
            binary(root.right, s + "->" + root.val);
        }
    }

}
