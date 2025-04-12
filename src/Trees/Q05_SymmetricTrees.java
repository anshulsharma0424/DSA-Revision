package Trees;

public class Q05_SymmetricTrees {

    public static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return Q04_MirrorTrees.isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        // Creating a sample symmetric binary tree
        //        1
        //       / \
        //      2   2
        //     / \ / \
        //    3  4 4  3
        Node root;
        root= new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println(isSymmetric(root));
    }
}
