package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-31 07:01
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class deleteDuplicates82 {


    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode tempNode = preHead;

        while (tempNode.next != null && tempNode.next.next != null) {
            if (tempNode.next.val == tempNode.next.next.val) {
                int val = tempNode.next.val;
                while (tempNode.next != null && tempNode.next.val == val) {
                    tempNode.next = tempNode.next.next;
                }
            } else {
                tempNode = tempNode.next;
            }
        }
        return preHead.next;
    }


}
