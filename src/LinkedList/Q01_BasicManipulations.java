package LinkedList;

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        next = null;
    }
}

public class Q01_BasicManipulations {

    // Print LinkedList
    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }

    // Create LinkedList from an Array
    public static Node CreateLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return  null;

        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = newNode;
        }

        return head;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printLinkedList(CreateLinkedList(arr));
    }
}
