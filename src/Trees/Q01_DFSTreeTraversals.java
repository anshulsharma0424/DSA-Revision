package Trees;

public class Q01_DFSTreeTraversals {
    Node root;

    public void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        // Creating a sample tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        Q01_DFSTreeTraversals tree = new Q01_DFSTreeTraversals();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.preOrder(tree.root);
        System.out.println();

        tree.inOrder(tree.root);
        System.out.println();

        tree.postOrder(tree.root);
        System.out.println();
    }
}


























