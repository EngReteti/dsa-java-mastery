package day03_stacks;

/**
 * Objective: Build a Stack from scratch using an Array
 */
public class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // Stack is empty when top is -1
    }

    // Push: Add item and move top up
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!"); // Error handling
            return;
        }
        arr[++top] = x;
    }

    // Pop: Return top item and move top down
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }
}
