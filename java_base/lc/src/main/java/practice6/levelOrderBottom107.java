package practice6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 21:37
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class levelOrderBottom107 {


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<TreeNode> nodeList = new LinkedList<>();
        LinkedList<List<Integer>> result = new LinkedList<>();
        nodeList.add(root);
        while (nodeList.size() != 0) {

            List<Integer> list = new LinkedList<>();
            int size = nodeList.size();
            for (int i = 0 ;i < size; i++) {
                TreeNode tn = nodeList.removeFirst();
                list.add(tn.val);
                if (tn.left != null) {
                    nodeList.add(tn.left);
                }
                if (tn.right != null) {
                    nodeList.add(tn.right);
                }
            }
            result.addFirst(list);
        }
        return result;
    }


}
