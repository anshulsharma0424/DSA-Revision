package Trees;

import java.util.*;

public class Q01_Fundamentals {
    Node root = null;

    // Tree Traversals - Recursive implementations
    public static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static List<Integer> preOrder2(Node root){
        if(root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        list.add(root.data);
        list.addAll(preOrder2(root.left));
        list.addAll(preOrder2(root.right));

        return list;
    }

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static List<Integer> inOrder2(Node root){
        if(root==null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        list.addAll(inOrder2(root.left));
        list.add(root.data);
        list.addAll(inOrder2(root.right));
        return list;
    }

    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static List<Integer> postOrder2(Node root){
        if(root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.addAll(postOrder2(root.left));
        list.addAll(postOrder2(root.right));
        list.add(root.data);

        return list;
    }


    // Tree Traversals - Iterative implementations (Using 'STACK' data structure)
    public static void preOrder3(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node curr = st.pop();
            System.out.print(curr.data + " ");

            if(curr.right != null) st.push(curr.right);
            if(curr.left != null) st.push(curr.left);
        }
    }

    public static void inOrder3(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();

        Node curr = root;

        while(!st.isEmpty() || curr != null){
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    public static void postOrder3(Node root){
        if(root == null) return;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);

        while (!st1.isEmpty()) {
            Node curr = st1.pop();
            st2.push(curr);

            if (curr.left != null) st1.push(curr.left);
            if (curr.right != null) st1.push(curr.right);
        }

        while (!st2.isEmpty()) {
            System.out.print(st2.pop().data + " ");
        }
    }

    // Level Order Traversal
    public static void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
    }


    public static void main(String[] args) {
        Q01_Fundamentals tree = new Q01_Fundamentals();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("====== PreOrder traversal ======");
        preOrder(tree.root);
        System.out.println();
        System.out.println(preOrder2(tree.root));
        preOrder3(tree.root);
        System.out.println();

        System.out.println("====== InOrder traversal ======");
        inOrder(tree.root);
        System.out.println();
        System.out.println(inOrder2(tree.root));
        inOrder3(tree.root);
        System.out.println();

        System.out.println("====== PostOrder traversal ======");
        postOrder(tree.root);
        System.out.println();
        System.out.println(postOrder2(tree.root));
        postOrder3(tree.root);
        System.out.println();

        System.out.println("==== LevelOrder traversal ======");
        levelOrder(tree.root);
    }
}
