package lc2;

/**
 * @description:
 * @author: junmo
 * @create: 2021-10-04 20:00
 **/

public class removeNthFromEnd021 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode fastNode = preHead;
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }
        ListNode slowNode = preHead;
        while (fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        slowNode.next = slowNode.next.next;
        return preHead.next;
    }


}
