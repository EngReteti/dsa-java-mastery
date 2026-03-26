package trees;

import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i) { return (i - 1) / 2; }

    public void insert(int value) {
        if (size == capacity) return;
        
        // Insert at the end
        int current = size;
        heap[size++] = value;

        // "Bubble Up" to maintain Max-Heap property
        while (current != 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        System.out.println("Max-Heap Array: " + Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(30);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(40);

        System.out.println("After inserting 10, 30, 20, 5, 40:");
        maxHeap.printHeap();
        System.out.println("The root (largest) is: " + maxHeap.heap[0]);
    }
}
