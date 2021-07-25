package practice5;


/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-25 10:37
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class isPalindrome234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        ListNode fastNode = preHead;
        ListNode slowNode = preHead;

        while (fastNode.next != null && fastNode.next.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        ListNode rightHead = reverseList(slowNode.next);
        ListNode leftHead = preHead.next;
                slowNode.next = null;

        while (rightHead != null && leftHead != null) {
            if (rightHead.val != leftHead.val) {
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;

        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


}
