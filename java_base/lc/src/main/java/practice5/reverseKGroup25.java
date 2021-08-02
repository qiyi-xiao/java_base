package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-23 07:25
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class reverseKGroup25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = new ListNode(-1);
        ListNode preTempNode = preHead;
        preHead.next = head;
        while (preTempNode.next != null) {
            ListNode nextPreTempNode = preTempNode.next;

            ListNode temp = preTempNode;
            for (int i = 0; i < k; i++) {
                temp = temp.next;
                if (temp == null) {
                    break;
                }
            }


            int index = 0;
            ListNode pre = null;
            ListNode cur = preTempNode.next;
            while (cur != null && index++ < k) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }

            preTempNode.next = pre;
            preTempNode = nextPreTempNode;
            nextPreTempNode.next = cur;
        }
        return preHead.next;
    }

    private ListNode reverse(ListNode node, int k) {
        if (node == null || node.next == null) {
            return node;
        }
        int index = 0;
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null && index++ < k) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


}
