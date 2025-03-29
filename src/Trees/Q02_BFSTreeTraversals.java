package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Q02_BFSTreeTraversals {

    Node root;

    public void levelOrder(Node root){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.data+" ");

            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }
    }

    public void levelOrder2(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++){
                Node temp = queue.remove();
                System.out.print(temp.data+" ");

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating a sample tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        Q02_BFSTreeTraversals tree = new Q02_BFSTreeTraversals();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.levelOrder(tree.root);
        System.out.println();
        tree.levelOrder2(tree.root);

    }
}
