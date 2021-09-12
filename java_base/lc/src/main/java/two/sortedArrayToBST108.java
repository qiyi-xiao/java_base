package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-03 07:17
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class sortedArrayToBST108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }

        TreeNode treeNode = binarySearch(nums,0, nums.length);
        return treeNode;

    }

    private TreeNode binarySearch(int[] nums,int left, int right) {
        if (left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode treeNode = new TreeNode();
        treeNode.val = nums[mid];
            treeNode.left= binarySearch(nums, left, mid - 1);
            treeNode .right = binarySearch(nums, mid + 1, right);
        return treeNode;
    }
}
