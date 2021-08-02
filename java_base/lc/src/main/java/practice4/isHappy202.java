package practice4;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-18 19:58
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isHappy202 {

    //4 开始

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            fast = getNum(fast);
            slow = getNum(slow);
            slow = getNum(slow);
        }while ( fast != slow);

        return slow == 1;
    }


    public static int getNum(int n){
        int num = 0;

        while (n > 0) {
            num = num + (int) Math.pow(n % 10, 2);
            n = n / 10;
        }
        return num;
    }

}
