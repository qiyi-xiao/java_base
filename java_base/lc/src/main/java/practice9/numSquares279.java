package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-04 07:02
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class numSquares279 {

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i - j] + 1,dp[i]);
            }
        }
        return dp[n];
    }

}
