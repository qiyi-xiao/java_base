package lc2;

/**
 * @description:
 * @author: junmo
 * @create: 2021-10-04 20:15
 **/

public class detectCycle022 {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null){
            return null;
        }
        ListNode fastNode = head;
        ListNode slowNode = head;
//        while (fastNode != slowNode){
//            if (fastNode == null || fastNode.next == null || fastNode.next.next == null){
//                return null;
//            }
//            fastNode = fastNode.next.next;
//            slowNode = slowNode.next;
//        }
        while (true) {
            if (fastNode == null || fastNode.next == null) return null;
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode) break;
        }
        ListNode lastNode = head;
        while (lastNode != slowNode) {
            lastNode = lastNode.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }






}
