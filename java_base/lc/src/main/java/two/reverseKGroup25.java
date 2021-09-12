package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-31 07:16
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reverseKGroup25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode preHead = new ListNode(-1);
        ListNode tempPreHead = preHead;
        preHead.next = head;
        ListNode tempNode = head;

        A:
        while (tempNode != null && tempNode.next != null) {

            ListNode curHead = tempNode;

            for (int i = 0; i < k - 1; i++) {
                tempNode = tempNode.next;
                if (tempNode == null) {
                    break A;
                }
            }

            ListNode curTail = tempNode;
            curTail.next = null;

            ListNode nextHead = tempNode.next;
            tempNode = nextHead;

            ListNode pre = tempPreHead;
            while (curHead != null) {
                ListNode next = curHead.next;
                curHead.next = pre;
                pre = curHead;
                curHead = next;
            }

            curHead.next = nextHead;

            tempPreHead = curHead;

        }

return null;
    }




}
