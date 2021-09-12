package two;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-29 12:21
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reverseBetween92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return head;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode leftPreHead = preHead;

        for (int i = 0; i < left - 1; i++) {
            leftPreHead = leftPreHead.next;
        }

        ListNode oldLeftHead = leftPreHead.next;
        for (int i = 0; i < right - left; i++) {
            ListNode leftHead = leftPreHead.next;
            ListNode moveNode = oldLeftHead.next;
            oldLeftHead.next = moveNode.next;
            leftPreHead.next = moveNode;
            moveNode.next = leftHead;
        }
        return preHead.next;
    }

}
