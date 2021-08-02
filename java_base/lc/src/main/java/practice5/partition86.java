package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-22 07:58
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class partition86 {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preMinHead = new ListNode(-1);
        ListNode preMaxHead = new ListNode(-1);

        ListNode tempMinNode = preMinHead;
        ListNode tempMaxNode = preMaxHead;

        while (head != null) {
            int val = head.val;
            if (val < x) {
                tempMinNode.next = head;
                tempMinNode = head;
                head = head.next;
                tempMinNode.next = null;
            }else {
                tempMaxNode.next = head;
                tempMaxNode = head;
                head = head.next;
                tempMaxNode.next = null;
            }
        }
        tempMinNode.next = preMaxHead.next;
        preMaxHead.next = null;
        return preMinHead.next;
    }


}
