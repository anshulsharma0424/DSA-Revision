package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Q02_HeightOfBinaryTree {
    Node root;

    public static int getHeight(Node root){
        if (root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static int getHeight2(Node root){
        if (root == null) return 0;

        // Initializing a queue to traverse the tree level by level
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 0;

        // Loop until the queue is empty
        while (!q.isEmpty()) {
            int levelSize = q.size();

            // Traverse all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            // Increment height after traversing each level
            depth++;
        }
        return depth - 1;

    }

    public static void main(String[] args) {
        Q02_HeightOfBinaryTree tree = new Q02_HeightOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);

        System.out.println("Height of tree is: " + getHeight(tree.root));
        System.out.println("Height of tree is: " + getHeight2(tree.root));

    }
}
