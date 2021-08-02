package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-23 07:51
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class insertionSortList147 {


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        ListNode listNode = insertionSortList(listNode1);
    }


    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode sortRight = new ListNode(Integer.MIN_VALUE);
        ListNode preHead = sortRight;
        sortRight.next = head;


        while (head != null) {
            if (head.val < sortRight.val) {
                ListNode insertLeftNode = preHead;
                while (insertLeftNode.next.val < head.val) {
                    insertLeftNode = insertLeftNode.next;
                }
                ListNode insertRightNode = insertLeftNode.next;
                sortRight.next = sortRight.next.next;
                insertLeftNode.next = head;
                head.next = insertRightNode;
                head = sortRight.next;
            }else {
                sortRight = sortRight.next;
                head = head.next;
            }
        }
        return preHead.next;
    }
}
