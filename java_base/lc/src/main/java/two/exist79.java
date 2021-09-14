package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-12 18:47
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class exist79 {

    int[][] ints = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    boolean inBoard = false;
    public boolean exist(char[][] board, String word) {

        char[] chars = word.toCharArray();

        boolean[][] bs = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!inBoard) {
                    backTrace(board, chars, bs, 0, 0, 0);
                }
            }
        }

        return inBoard;
    }

    private void backTrace(char[][] board, char[] chars, boolean[][] bs, int index, int r, int l) {
        if (index == chars.length){
            inBoard = true;
            return;
        }
        if (r >= board.length || r < 0){
            return;
        }
        if (l >= board[0].length || l < 0){
            return;
        }
        if (bs[r][l]){
            return;
        }
        if (board[r][l] != chars[index]){
            return;
        }
        bs[r][l] = true;
        backTrace(board, chars, bs, index + 1, r + 1, l);
        backTrace(board, chars, bs, index + 1, r - 1, l);
        backTrace(board, chars, bs, index + 1, r, l + 1);
        backTrace(board, chars, bs, index + 1, r, l - 1);
        bs[r][l] = false;
    }

}
