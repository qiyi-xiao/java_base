package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-14 12:39
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class lengthOfLIS300 {


    public int lengthOfLIS(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int[] dp = new int[nums.length];

        dp[0] = 1;
        int preMaxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > preMaxNum) {
                dp[i] = dp[i - 1] + 1;
                preMaxNum = nums[i];
            }else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[nums.length - 1];
    }



}
