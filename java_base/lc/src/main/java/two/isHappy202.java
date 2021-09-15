package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-29 10:58
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isHappy202 {

    public boolean isHappy(int n) {

        int fast = n;
        int slow = n;

        while (fast != slow){
            fast = countNext(fast);
            if (fast == 1){
                return true;
            }
            fast = countNext(fast);
            slow = countNext(slow);
        }
        return false;
    }

    private int countNext(int fast) {
        int next = 0;
        while (fast > 0) {
            next += (fast % 10) * (fast % 10);
            fast = fast / 10;
        }
        return next;
    }


}
