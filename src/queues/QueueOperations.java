public class QueueOperations {
    private Node front, rear;

    private class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("⚠️ Queue Underflow! Cannot dequeue from empty queue.");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public static void main(String[] args) {
        QueueOperations q = new QueueOperations();
        q.enqueue(101);
        q.enqueue(102);
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        // Edge case test
        q.dequeue();
    }
}
