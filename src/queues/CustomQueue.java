package queues;

/**
 * Day 4: Custom Circular Queue implementation using an Array
 */
public class CustomQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    // ENQUEUE: Add to the rear
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear = (rear + 1) % capacity; // Circular logic
        arr[rear] = item;
        size++;
    }

    // DEQUEUE: Remove from the front
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity; // Circular logic
        size--;
        return item;
    }
}
