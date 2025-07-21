package Trees.Binary_Tree;

import java.sql.Time;
import java.util.Date;

public class sizeMaxSumHeight {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int size(Node root) {
        if (root == null) return 0;
        return size(root.left) + size(root.right) + 1;  // +1 imp
    }

    public static int sum(Node root) {
        if (root == null) return 0;
        return sum(root.left) + sum(root.right) + root.val;  // +root.val imp
    }

    public static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;  //imp -> if all values are in negative then it returns the max value 0
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int height(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
//          |-----1------|
//      |---2--|     |---3--|
//      4      5     n      6
