package zjfk;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-05 18:31
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class moveZeroes283 {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }


}
