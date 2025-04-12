package Trees;

public class Q06_DiameterOfTree {

    public static int getHeight(Node root){
        if (root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static int diameterOfTree(Node root) {
        if (root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int leftDiameter = diameterOfTree(root.left);
        int rightDiameter = diameterOfTree(root.right);

        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter,rightDiameter));
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

        System.out.println(diameterOfTree(root));

    }
}
