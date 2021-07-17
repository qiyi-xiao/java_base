package practice3;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-16 09:22
 **/

public class sortColors75 {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }

        int index0 = 0;
        int index2 = nums.length - 1;
        for (int index1 = 0; index1 <= index2; ) {
            if (nums[index1] == 0) {
                nums[index0++] = 0;
                index1++;
            } else if (nums[index1] == 2) {
                swap(nums, index1, index2--);
            } else {
                index1++;
            }

        }
        for (int i = index0; i <= index2; i++) {
            nums[i] = 1;
        }
    }

    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
