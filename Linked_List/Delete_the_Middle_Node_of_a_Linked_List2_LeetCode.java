package Linked_List;

public class Delete_the_Middle_Node_of_a_Linked_List2_LeetCode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Delete_the_Middle_Node_of_a_Linked_List2_LeetCode obj = new Delete_the_Middle_Node_of_a_Linked_List2_LeetCode();
        ListNode a = obj.new ListNode(1);  // imp
        ListNode b = obj.new ListNode(2);  // imp
        ListNode c = obj.new ListNode(2);  // imp
        ListNode d = obj.new ListNode(1);  // imp
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(obj.deleteMiddle(a));
    }

    public ListNode deleteMiddle(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        if (n == 1) {
            return null;
        }
        int mid = (n / 2) + 1;
        n = 1;
        temp = head;
        while (n < mid - 1) {
            n++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
