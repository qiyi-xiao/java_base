package practice9;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-02 22:19
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class climbStairs70 {

    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}
