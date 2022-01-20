package lc2;

/**
 * @description:
 * @author: junmo
 * @create: 2021-10-04 21:24
 **/

public class getIntersectionNode023 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;

        while (curA != curB) {
            curA = curA == null ? curB : curA.next;
            curB = curB == null ? curA : curB.next;
        }
        return curA;
    }



}
