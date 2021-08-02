package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 09:55
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reorderList143 {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }


        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        ListNode fastNode = preHead;
        ListNode slowNode = preHead;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        ListNode rightHead = reverseList(slowNode.next);
        slowNode.next = null;
        ListNode leftHead = preHead.next;
        ListNode tempNode = preHead;
        int count = 0;
        while (rightHead != null && leftHead != null) {
            count++;
            if ((count & 1) == 1) {
                tempNode.next = leftHead;
                leftHead = leftHead.next;
                tempNode = tempNode.next;
            }else {
                tempNode.next = rightHead;
                rightHead = rightHead.next;
                tempNode = tempNode.next;
            }

        }
        tempNode.next = rightHead == null ? leftHead : rightHead;
        head = preHead.next;
    }

    private ListNode reverseList(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode pre = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


}
