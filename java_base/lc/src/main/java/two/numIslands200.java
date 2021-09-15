package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-12 19:01
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class numIslands200 {

    //[
    // ["1","1","1","1","0"],
    // ["1","1","0","1","0"],
    // ["1","1","0","0","0"],
    // ["0","0","0","0","0"]]

    public int numIslands(char[][] grid) {
        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    setGridNumZero(grid,i,j);
                }
            }
        }
        return islandCount;
    }

    private void setGridNumZero(char[][] grid, int r, int l) {
        if (r < 0 || r >= grid.length) {
            return;
        }
        if (l < 0 || l > grid[0].length){
            return;
        }
        if (grid[r][l] == 0) {
            return;
        }
        grid[r][l] = 0;
        setGridNumZero(grid, r + 1, l);
        setGridNumZero(grid, r - 1, l);
        setGridNumZero(grid, r, l + 1);
        setGridNumZero(grid, r, l - 1);
    }
}
