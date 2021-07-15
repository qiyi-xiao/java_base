package practice3;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-15 19:45
 **/

public class moveZeroes283 {

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[index++] = 0;
        }
    }
}
