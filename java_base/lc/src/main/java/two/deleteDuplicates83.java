package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-31 06:55
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
        ListNode tempNode = preHead;
        preHead.next = head;

        int[] ints = new int[10];

        while (tempNode.next != null && tempNode.next.next != null) {
            if (tempNode.next.val == tempNode.next.next.val) {
                tempNode.next = tempNode.next.next;
            }else {
                tempNode = tempNode.next;
            }
        }
        return preHead.next;
    }



}
