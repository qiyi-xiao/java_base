package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 09:38
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class rotateRight61 {


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode fastNode = preHead;
        ListNode slowNode = preHead;
        int index = 0;
        while (index++ < k) {
            fastNode = fastNode.next == null ? preHead.next : fastNode.next;
        }
        if (fastNode == preHead) {
            return preHead.next;
        }

        while (fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        ListNode resultHead = slowNode.next;

        slowNode.next = null;

        fastNode.next = preHead.next;
        preHead.next = null;

        return resultHead;
    }

}
