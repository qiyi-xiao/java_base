package zjfk;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-05 09:10
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class minPathSum64 {

    public int minPathSum(int[][] grid) {
        if (grid == null) {
            return 0;
        }

        int[][] path = new int[grid.length][grid[0].length];

        path[0][0] = grid[0][0];
        for (int j = 1; j < grid[0].length; j++) {
            path[0][j] = grid[0][j] + path[0][j - 1];
        }
//
//        for (int i = 1; i < grid.length; i++) {
//            db[i][0] = grid[i][0] + db[i - 1][0];
//        }

        for (int i = 1; i < grid.length; i++) {
            path[i][0] = grid[i][0] + path[i - 1][0];
            for (int j = 1; j < grid[0].length; j++) {
                path[i][j] = Math.min(path[i - 1][j], path[i][j - 1]) + grid[i][j];
            }
        }
        return path[grid.length - 1][grid[0].length - 1];
    }

    /*
        int[][] path = new int[grid.length][grid[0].length];
        path[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            path[0][i] = grid[0][i] + path[0][i - 1];

        }
        for (int i = 1; i < grid.length; i++) {
            path[i][0] = path[i - 1][0] + grid[i][0];
            for (int j = 1; j < grid[i].length; j++) {
                path[i][j] = Math.min(path[i][j - 1], path[i - 1][j]) + grid[i][j];
            }
        }
        return path[grid.length-1][grid[0].length - 1];
    }
     */


}
