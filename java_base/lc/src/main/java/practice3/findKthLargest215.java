package practice3;

import java.util.Arrays;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-17 08:09
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class findKthLargest215 {

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr));

    }


    public int findKthLargest(int[] nums, int k) {
        buildMaxHeap(nums);
        for (int i = 0; i < k - 1; i++) {
            swap(nums,0, nums.length - 1 - i);
            adjustNode(nums, 0, nums.length - i - 1);
        }
        return nums[0];
    }

    private static void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2 + 1; i >= 0; i--) {
            adjustNode(nums, i, nums.length);
        }
    }
    private static void adjustNode(int[] nums, int i, int length) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndex = i;
        if (left < length && nums[left] > nums[maxIndex]){
            maxIndex = left;
            //swap(nums, left ,i);
            //adjustNode(nums, left, length);
        }
        if (right < length && nums[right] > nums[maxIndex]){
            maxIndex = right;
            //swap(nums, right, i);
            //adjustNode(nums, right, length);
        }
        if(maxIndex != i){
            swap(nums, maxIndex, i);
            adjustNode(nums, maxIndex, length);
        }
    }

    private static void adjustNode2(int[] nums, int i, int length) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < length && nums[left] > nums[i]){
            swap(nums, left ,i);
            adjustNode(nums, left, length);
        }
        if (right < length && nums[right] > nums[i]){
            swap(nums, right, i);
            adjustNode(nums, right, length);
        }
    }


    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }



}
