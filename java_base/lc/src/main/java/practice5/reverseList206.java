package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-21 21:56
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reverseList206 {


    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

}
