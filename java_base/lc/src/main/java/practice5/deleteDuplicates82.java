package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-22 23:19
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
                ListNode notEqualNode = tempNode.next.next.next;
                while (notEqualNode != null && notEqualNode.val == tempNode.next.val) {
                    notEqualNode = notEqualNode.next;
                }
                tempNode.next = notEqualNode;
            }else {
                tempNode = tempNode.next;
            }
        }
        return preHead.next;
    }




}
