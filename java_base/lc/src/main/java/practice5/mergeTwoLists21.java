package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-22 23:31
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class mergeTwoLists21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }


        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                preHead.next = l2;
                l2 = l2.next;
            }else {
                preHead.next = l1;
                l1 = l1.next;
            }
            preHead = preHead.next;
        }

        preHead.next = l1 == null ? l2 : l1;
        return pre.next;
    }


}
