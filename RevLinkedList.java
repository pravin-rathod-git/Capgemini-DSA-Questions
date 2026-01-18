class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RevLinkedList {

    // Function to reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node temp = head;

        while (temp != null) {
            Node next = temp.next; // store next
            temp.next = prev;      // reverse link
            prev = temp;           // move prev
            temp = next;           // move temp
        }
        return prev; // new head
    }

    // Function to display linked list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {

        // Creating linked list: 1 → 2 → 3 → 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        display(head);

        head = reverse(head);

        System.out.println("Reversed Linked List:");
        display(head);
    }
}
