package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 01:02
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class removeNthFromEnd19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return n==1 ? null : head;
        }

        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        ListNode fastNode = preHead;
        ListNode lowNode = preHead;
        int index = 0;
        while (fastNode.next != null && index++ < n) {
            fastNode = fastNode.next;
        }


        while (fastNode.next != null) {
            fastNode = fastNode.next;
            lowNode = lowNode.next;
        }
        ListNode removeNode = lowNode.next;
        lowNode.next = removeNode.next;
        removeNode.next = null;
        return preHead.next;
    }

}
