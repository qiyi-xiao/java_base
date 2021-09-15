package zjfk;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-09-05 09:46
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class removeNthFromEnd19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        ListNode preFastNode = preHead;
        ListNode preSlowNode = preHead;
        for (int i = 0; i < n; i++) {
            preFastNode = preFastNode.next;
        }

        while (preFastNode != null && preFastNode.next != null) {
            preFastNode = preFastNode.next;
            preSlowNode = preSlowNode.next;
        }

        preSlowNode.next = preSlowNode.next.next;
        return preHead.next;
    }

}
