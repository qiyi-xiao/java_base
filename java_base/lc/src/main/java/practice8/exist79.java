package practice8;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-15 21:14
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class exist79 {

    boolean b = false;

    public boolean exist(char[][] board, String word) {
        if (board == null) {
            return false;
        }
        if (board[0].length == 0) {
            return false;
        }
        char[] chars = word.toCharArray();
        boolean[][] booleans = new boolean[board.length][board[0].length];
        backTrace(board, chars, 0, 0, 0, booleans);
        return b;
    }

    private void backTrace(char[][] board, char[] chars, int r, int l, int curIndedx, boolean[][] booleans) {
        if (r >= board.length || l >= board[0].length) {
            return;
        }
        if (booleans[r][l]) {
            return;
        }
        if (curIndedx == chars.length - 1 && board[r][l] == chars[chars.length - 1]) {
            b = true;
            return;
        }
        if (board[r][l] == chars[curIndedx]) {
            booleans[r][l] = true;
            curIndedx++;
        }
        if (r - 1 >= 0 && !booleans[r - 1][l]) {
            backTrace(board, chars, r - 1, l, curIndedx, booleans);
        }
        if (r + 1 < board.length && !booleans[r + 1][l]) {
            backTrace(board, chars, r + 1, l, curIndedx, booleans);
        }
        if (l - 1 >= 0 && !booleans[r][l - 1]) {
            backTrace(board, chars, r, l - 1, curIndedx, booleans);
        }
        if (l + 1 < board[0].length && !booleans[r][l + 1]) {
            backTrace(board, chars, r, l + 1, curIndedx, booleans);
        }


    }

}
