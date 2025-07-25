package Linked_List;

import java.util.List;

public class Palindrome_Linked_List_LeetCode {
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
        ListNode a = new ListNode(1);  // imp
        ListNode b = new ListNode(2);  // imp
        ListNode c = new ListNode(2);  // imp
        ListNode d = new ListNode(1);  // imp
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        int ind = 0;
        while (temp != null) {
            arr[ind] = temp.val;
            ind++;
            temp = temp.next;
        }
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


//        public boolean isPalindrome(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        boolean flag = true;
//        int n = 0;
//        ListNode temp = head;
//        while(temp != null){
//            n++;
//            if(n>1) flag = false;
//            if(!stack.isEmpty()){
//                if(stack.peek() == temp.val){
//                    stack.pop();
//                } else{
//                    stack.push(temp.val);
//                }
//                temp = temp.next;
//            } else {
//                stack.push(temp.val);
//                temp = temp.next;
//            }
//        }
//        if(stack.size()==1 && flag == true){
//            return true;
//        }
//        return stack.isEmpty();
//    }