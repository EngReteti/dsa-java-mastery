package queues;

public class CircularQueue {
    private int size, front, rear;
    private int[] queue;

    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = this.rear = -1;
    }

    // Enqueue: Add element to the queue
    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = data;
        System.out.println("Enqueued: " + data);
    }

    // Dequeue: Remove element from the queue
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        int data = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        System.out.println("Dequeued: " + data);
    }

    public void display() {
        if (front == -1) return;
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        cq.dequeue();
        cq.enqueue(60); // Reuses the empty space from dequeue!
        cq.display();
    }
}
