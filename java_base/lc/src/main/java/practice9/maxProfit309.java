package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-08 10:06
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class maxProfit309 {

    public int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
        int[][] dp = new int[prices.length][3];
        // 0 买入  1 冷冻期  2 卖出
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = -prices[i] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = dp[i - 1][0] ;
            dp[i][2] = prices[i] + Math.max(dp[i - 1][1], dp[i - 1][0]);
        }
        return Math.max(dp[prices.length - 1][1],dp[prices.length - 1][2]);
    }

}
