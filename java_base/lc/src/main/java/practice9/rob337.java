package practice9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-08 08:57
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class rob337 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
//        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
//        TreeNode node5 = new TreeNode(-2);
        TreeNode node6 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
//        node1.left = node3;
        node1.right = node4;
//        node2.left = node5;
        node2.right = node6;
//        rob(root);
    }

    int treeMax = 0;
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("0" + "_" + "0", 0);
        map.put("0" + "_" + "1", root.val);
        robTree(root.left,  0,1, map);
        robTree(root.right,  0,2, map);
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + "###" + m.getValue());
            max = Math.max(m.getValue(), max);
        }
        return treeMax;
    }

    private void robTree(TreeNode root,int parentIndex, int index, Map<String, Integer> map) {
        if (root.left == null && root.right == null) {
            map.put(index + "_" + "1", map.getOrDefault(parentIndex + "_" + "0", 0) + root.val);
            map.put(index + "_" + "0", Math.max(
                    map.getOrDefault(parentIndex + "_" + "1", 0),
                    map.getOrDefault(parentIndex + "_" + "0", 0)
            ));
            treeMax = treeMax + Math.max(
                    map.getOrDefault(index + "_" + "1", 0),
                    map.getOrDefault(index + "_" + "0", 0)
            );

            return;
        }

        map.put(index + "_" + "1", map.getOrDefault(parentIndex + "_" + "0", 0) + root.val);
        map.put(index + "_" + "0", Math.max(
                map.getOrDefault(parentIndex + "_" + "1", 0),
                map.getOrDefault(parentIndex + "_" + "0", 0)
        ));
        if (root.left != null) {
            robTree(root.left, index, index * 2 + 1, map);
        }
        if (root.right != null) {
            robTree(root.right, index, index * 2 + 2, map);
        }
    }
}
