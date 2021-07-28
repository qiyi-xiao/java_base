package practice6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 23:08
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class rightSideView199 {


    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<TreeNode> list = new LinkedList<>();

        List<Integer> result = new ArrayList<>();

        list.add(root);

        while (list.size() != 0) {

            int size = list.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = list.removeFirst();
                if (i == size - 1) {
                    result.add(treeNode.val);
                }
                if (treeNode.left != null) {
                    list.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    list.add(treeNode.right);
                }
            }
        }
        return result;
    }

}
