class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class QueueOperations {
    private Node front = null, rear = null;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued (Added to Rear): " + data);
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Dequeued (Removed from Front): " + front.data);
        front = front.next;
        if (front == null) rear = null;
    }

    public void display() {
        Node temp = front;
        System.out.print("Current Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        QueueOperations q = new QueueOperations();
        q.enqueue(101);
        q.enqueue(102);
        q.enqueue(103);
        q.display();
        q.dequeue();
        q.display();
    }
}
