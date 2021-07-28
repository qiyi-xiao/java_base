package practice6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 21:40
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class zigzagLevelOrder103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        boolean isOdd = true;
        while (list.size() != 0) {

            int size = list.size();
            LinkedList<Integer> ls = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = list.removeFirst();
                if (isOdd) {
                    ls.addLast(treeNode.val);
                } else {
                    ls.addFirst(treeNode.val);
                }
                if (treeNode.left != null) {
                    list.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    list.add(treeNode.right);
                }
            }
            isOdd = !isOdd;
            result.add(ls);
        }

        return result;
    }

}
