package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-21 23:32
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class addTwoNumbers445 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode preNode = new ListNode(-1);
        ListNode preHead = preNode;
        int ext = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int addVal = (val1 + val2 + ext) % 10;
            ext = (val1 + val2 + ext) / 10;

            preNode.next = new ListNode(addVal);
            preNode = preNode.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (ext != 0) {
            preNode.next = new ListNode(ext);
        }
        return reverseList(preHead.next);
    }



    private static ListNode reverseList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode node = head;
        ListNode next;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


}
