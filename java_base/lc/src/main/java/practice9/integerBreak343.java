package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-03 21:39
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class integerBreak343 {

    //f(n) = f(i) * (n - i)
    public int integerBreak(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(dp[j] * (i - j),(i - j)* j));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }

}
