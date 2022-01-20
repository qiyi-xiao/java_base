package lc2;

/**
 * @description:
 * @author: junmo
 * @create: 2021-10-04 21:33
 **/

public class reverseList024 {

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
