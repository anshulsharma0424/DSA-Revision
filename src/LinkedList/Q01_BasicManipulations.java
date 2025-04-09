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


    // Insert in the beginning
    public static Node insertAtBeginning(Node head, int val) {
        if (head == null) {
            head = new Node(val);
            return head;
        }

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        return head;
    }

    // Insert at end
    public static Node insertAtEnd(Node head, int val) {
        if (head == null) {
            head = new Node(val);
            return head;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);

        return head;
    }

    // Insert at specific position
    public static Node insertAtPosition(Node head, int val, int position) {
        // Create the new node to be inserted
        Node newNode = new Node(val);

        // If inserting at head (position 1 or empty list)
        if (head == null || position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        // Traverse to the node just before the insertion position
        // We use position > 2 because:
        // - position 1 is handled above
        // - when position is 2, we want to insert after head (no traversal needed)
        while (curr.next != null && position > 2) {
            curr = curr.next;
            position--;
        }

        // Insert the new node
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    // Length of a Linked List
    public static int length(Node head) {
        if (head == null) return 0;
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Searching for an element in LinkedList
    public static boolean isPresent(Node head, int val) {
        if (head == null) return false;
        Node curr = head;
        while (curr != null) {
            if (curr.val == val) return true;
            curr = curr.next;
        }
        return false;
    }

    // Deleting a node from end
    public static Node deleteFromEnd(Node head){
        if (head == null) return null;
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    // Deleting a node from starting
    public static Node deleteFromStart(Node head){
        if (head == null) return null;
        head = head.next;
        return head;
    }

    // Deleting a node at specific position
    public  static Node deleteNodeFromPosition(Node head, int pos) {
        if (head == null || pos == 0) return head;
        if (pos == 1){
            return deleteFromStart(head);
        }
        Node curr = head;

        while (curr.next != null && pos >= 2) {
            curr = curr.next;
            pos--;
        }
        if (pos == 1 && curr.next != null) {
            curr.next = curr.next.next;
            return head;
        }
        return head;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        Node headNode = CreateLinkedList(arr);
        printLinkedList(headNode); // 2,3,4,5
        System.out.println();

        headNode = insertAtBeginning(headNode, 1);
        printLinkedList(headNode); // 1,2,3,4,5
        System.out.println();

        headNode = insertAtEnd(headNode, 6);
        printLinkedList(headNode); // 1,2,3,4,5,6
        System.out.println();

        headNode = insertAtPosition(headNode, 77, 5);
        printLinkedList(headNode); // 1,2,3,4,77,5,6
        System.out.println();

        int length = length(headNode);
        System.out.println("Length: " + length); // 7

        System.out.println(isPresent(headNode, 79)); // false
        System.out.println(isPresent(headNode, 77)); // true

        headNode = deleteFromEnd(headNode);
        printLinkedList(headNode); // 1,2,3,4,77,5
        System.out.println();

        headNode = deleteFromStart(headNode);
        printLinkedList(headNode); // 2,3,4,77,5
        System.out.println();

        headNode = deleteNodeFromPosition(headNode, 1);
        printLinkedList(headNode); // 3,4,77,5
        System.out.println();

    }
}
