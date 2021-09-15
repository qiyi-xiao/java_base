/**
 * @author ：qiyingx.xiao
 * @date ：Created in 2021-08-14 14:55
 * @description：
 * @modified By：0.0
 * @version: 1.0.0
 */

public class Main {

    public ListNode mergeList(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }

        ListNode preTempHead = new ListNode(-1);
        ListNode preHead = preTempHead;
        while (head1 != null && head2 != null) {
            if (head1.getVal() > head2.getVal()) {
                preTempHead.nextNode = head2;
                head2 = head2.nextNode;
                preTempHead = preTempHead.nextNode;
            } else if (head1.getVal() == head2.getVal()) {
                head1 = head1.nextNode;
            } else {
                preTempHead.nextNode = head1;
                head1 = head1.nextNode;
                preTempHead = preTempHead.nextNode;
            }
        }
        preTempHead.nextNode = head1 == null ? head2 : head1;
        return preHead.nextNode;
    }


}

class ListNode {

    private int val;

    public ListNode nextNode;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
