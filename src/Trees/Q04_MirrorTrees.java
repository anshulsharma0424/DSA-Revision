package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Q04_MirrorTrees {

    // Check if two trees are mirror of each other - // same concept as identical trees with a minor change in return statement
    public static boolean isMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true; // when both are null -> return true
        if (root1 == null || root2 == null) return false; // when either of them are null -> return false

        return (root1.data == root2.data) && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }

    // return the mirror of a tree - The idea is to use recursion to traverse the tree in Post Order (left, right, root)
    // and while traversing each node, swap the left and right subtrees.
    public static void mirror(Node root) {
        if (root == null) return;

        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    // Print the tree as level order
    static void levelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            System.out.print(curr.data + " ");
            queue.add(curr.left);
            queue.add(curr.right);
        }
    }

    public static void main(String[] args) {
        // Representation of input binary tree 2 (mirror)
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        mirror(root2);
        levelOrder(root2);

        // Representation of its mirror
        //        1
        //       / \
        //      3   2
        //          / \
        //         5   4
    }
}
