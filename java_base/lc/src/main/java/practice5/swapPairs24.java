package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-23 07:17
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class swapPairs24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode preTempHead = preHead;

        while (preHead.next != null && preHead.next.next != null) {
            ListNode preNext3 = preHead.next.next.next;

            ListNode preNext = preHead.next;
            preHead.next = preHead.next.next;
            preHead.next.next = preNext;
            preNext.next = preNext3;
            preHead = preNext;
        }
        return preTempHead.next;
    }


}
