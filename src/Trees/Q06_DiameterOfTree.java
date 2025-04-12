package Trees;

public class Q06_DiameterOfTree {

    public static int diameterOfTree(Node root) {
        if (root == null) return 0;

        int leftHeight = Q02_HeightOfBinaryTree.getHeight(root.left);
        int rightHeight = Q02_HeightOfBinaryTree.getHeight(root.right);

        int leftDiameter = diameterOfTree(root.left);
        int rightDiameter = diameterOfTree(root.right);

        return Math.max(leftHeight+rightHeight, Math.max(leftDiameter,rightDiameter));
    }

    public static void main(String[] args) {
        // Constructed binary tree is
        //          5
        //        /   \
        //       8     6
        //      / \   /
        //     3   7 9
        Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(9);


    }
}
