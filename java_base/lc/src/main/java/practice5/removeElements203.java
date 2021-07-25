package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-22 22:30
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class removeElements203 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null || head.next == null) {

            return head;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode tempNode = preHead;

        while (tempNode.next != null) {
            if (tempNode.next.val == val) {
                ListNode temp = tempNode.next;
                tempNode.next = tempNode.next.next;
                temp.next = null;
            }else {
                tempNode = tempNode.next;
            }
        }
        return preHead.next;
    }


}
