public class SinglyLinkedList {
    // 1. Node Class: The basic building block
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // 2. Insert Logic: Add a node to the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Display Logic: Traverse and print the list
    public void display() {
        Node temp = head;
        System.out.print("Singly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Simulating the logic
        list.insert(10);
        list.insert(20);
        list.insert(30);
        
        System.out.println("--- Day 2: Linked List Logic ---");
        list.display();
    }
}

