class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class SinglyLinkedList {
    private Node head = null;

    // 1. Beginning Insertion
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at Beginning: " + data);
    }

    // 2. End Insertion
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Inserted at End: " + data);
    }

    // 3. Display Logic
    public void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
    }
}
