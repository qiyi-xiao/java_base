package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-18 21:53
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class findKthLargest215 {

    public int findKthLargest(int[] nums, int k) {
        if (nums == null){
            return -1;
        }
        buildMaxHeap(nums);
        for (int i = 0; i < k - 1; i++) {
            swap(nums, 0, nums.length - 1 - i);
            adjustHeapNode(nums, 0, nums.length - 1 - i - 1);
        }
        return nums[0];
    }

    private void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2; i >= 0 ; i--) {
            adjustHeapNode(nums, i, nums.length);
        }
    }

    private void adjustHeapNode(int[] nums, int index, int length) {
        int curNum = nums[index];
        int maxIndex = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < length && nums[left] > nums[maxIndex]){
            maxIndex = left;
        }
        if (right < length && nums[right] > nums[maxIndex]){
            maxIndex = right;
        }
        if (maxIndex != index) {
            swap(nums, maxIndex, index);
            adjustHeapNode(nums, maxIndex, length);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
