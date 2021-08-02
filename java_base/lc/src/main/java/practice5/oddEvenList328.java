package practice5;

/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-07-21 23:56
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class oddEvenList328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preOddNode = new ListNode(-1);
        ListNode preEvenNode = new ListNode(-1);
        ListNode preTempOddNode = preOddNode;
        ListNode preTempEvenNode = preEvenNode;

        int index = 1;
        while (head != null) {
            boolean isOdd = index % 2 == 1;
            if (isOdd) {
                preOddNode.next = head;
                preOddNode = preOddNode.next;
                head = head.next;
                preOddNode.next = null;
            }else {
                preEvenNode.next = head;
                preEvenNode = preEvenNode.next;
                head = head.next;
                preEvenNode.next = null;
            }
            index++;
        }
        preOddNode.next = preTempEvenNode.next;
        preTempEvenNode.next = null;
        return preTempOddNode.next;
    }


}
