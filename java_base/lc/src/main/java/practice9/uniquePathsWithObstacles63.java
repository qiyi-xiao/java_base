package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-05 23:25
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class uniquePathsWithObstacles63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1){
                for (; i < m; i++) {
                    dp[i][0] = 0;
                }
            }else {
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1){
                for (; i < n; i++) {
                    dp[0][i] = 0;
                }
            }else {
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }


}
