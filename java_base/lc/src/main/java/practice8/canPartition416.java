package practice8;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-15 17:17
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class canPartition416 {

    boolean b = false;
    public boolean canPartition(int[] nums) {
        if (nums == null) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int subSum = sum / 2;
        backTrace(nums, 0, subSum);
        return b;
    }

    private void backTrace(int[] nums, int curIndex, int subSum) {
        if (b) {
            return;
        }
        if (subSum == 0) {
            b = true;
            return;
        }
        for (int i = curIndex; i < nums.length; i++) {
            if (b) {
                return;
            }
            backTrace(nums, i + 1, subSum);
            backTrace(nums, i + 1, subSum - nums[i]);
        }
    }

}
