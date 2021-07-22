package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-21 22:07
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reverseBetween92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode leftLeftNode = null;
        ListNode rightRightNode = null;
        ListNode leftNode = null;
        ListNode rightNode = null;
        ListNode tempNode = head;
        int index = 0;
        while (tempNode != null) {
            index++;
            if (left - 1 == index) {
                leftLeftNode = tempNode;
            }
            if (left == index) {
                leftNode = tempNode;
            }
            if (right == index) {
                rightNode = tempNode;
            }
            if (right + 1 == index) {
                rightRightNode = tempNode;
            }
            tempNode = tempNode.next;
        }
        if (leftLeftNode != null) {
            leftLeftNode.next = null;
        }
        if (rightNode != null) {
            rightNode.next = null;
        }
        ListNode pre = null;
        ListNode revHead = leftNode;
        while (leftNode != null) {
            ListNode next = leftNode.next;
            leftNode.next = pre;
            pre = leftNode;
            leftNode = next;
        }
        if (leftLeftNode != null) {
            leftLeftNode.next = pre;
        }
        if (revHead != null) {
            revHead.next = rightRightNode;
        }
        if (left == 1) {
            head = pre;
        }
        return head;

    }

}
