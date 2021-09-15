package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-05 23:36
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class rob198 {

    public int rob(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int[][] dp = new int[nums.length][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][0]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[nums.length - 1][1], dp[nums.length - 1][0]);
    }


}
