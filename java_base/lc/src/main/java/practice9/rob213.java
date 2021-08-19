package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-08 08:47
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class rob213 {

    public int rob(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[][] dp1 = new int[nums.length][2];
        int[][] dp2 = new int[nums.length][2];

        dp1[0][0] = 0;
        dp1[0][1] = nums[0];

        dp2[1][0] = 0;
        dp2[1][1] = nums[1];


        for (int i = 1; i < nums.length - 1; i++) {
            dp1[i][0] = Math.max(dp1[i - 1][1], dp1[i - 1][0]);
            dp1[i][1] = dp1[i - 1][0] + nums[i];
        }

        for (int i = 2; i < nums.length; i++) {
            dp2[i][0] = Math.max(dp2[i - 1][1], dp2[i - 1][0]);
            dp2[i][1] = dp2[i - 1][0] + nums[i];
        }
        return Math.max(Math.max(dp1[nums.length - 2][1], dp1[nums.length - 2][0])
                , Math.max(dp2[nums.length - 1][1], dp2[nums.length - 1][0]));
    }


}
