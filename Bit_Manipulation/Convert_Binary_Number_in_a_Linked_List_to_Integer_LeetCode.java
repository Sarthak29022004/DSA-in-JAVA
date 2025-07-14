package Bit_Manipulation;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer_LeetCode {

    public static class ListNode {

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
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(1);
        a.next = b;
        b.next = c;
        System.out.println();
        System.out.println(getDecimalValue(a));
    }

    public static int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = (num << 1) | head.val;
            head = head.next;
        }
        return num;
    }

}
