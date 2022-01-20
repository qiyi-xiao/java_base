package lc2;

/**
 * @description:
 * @author: junmo
 * @create: 2021-10-04 21:37
 **/

public class addTwoNumbers025 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        int sign = 0;
        ListNode preHead = new ListNode(-1);
        ListNode temp = preHead;
        while (l1 != null || l2 != null || sign == 1) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int curVal = val1 + val2 + sign;
            temp.next = new ListNode(curVal % 10);
            temp = temp.next;
            sign = curVal / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        return reverseList(preHead.next);
    }


    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }




}
