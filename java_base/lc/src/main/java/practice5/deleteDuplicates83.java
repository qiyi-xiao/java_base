package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-22 22:14
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class deleteDuplicates83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode preHead = new ListNode(-1);
        ListNode tempNode = head;
        preHead.next = head;

        while (tempNode != null && tempNode.next != null) {
            while (tempNode.next != null && tempNode.next.val == tempNode.val) {
                tempNode.next = tempNode.next.next;
            }
            tempNode = tempNode.next;
        }
        return preHead.next;
    }


}
