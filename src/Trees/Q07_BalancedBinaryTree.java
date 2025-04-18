package Trees;

public class Q07_BalancedBinaryTree {

    public static boolean isBalanced(Node root) {
        if (root == null) return true;

        int lHeight = Q02_HeightOfBinaryTree.getHeight(root.left);
        int rHeight = Q02_HeightOfBinaryTree.getHeight(root.right);

        int diff = Math.abs(lHeight - rHeight);

        if (diff > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        // Representation of input BST:
        //            1
        //           / \
        //          2   3
        //         /  \
        //        4   5
        //       /
        //      8
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(isBalanced(root));
    }
}
