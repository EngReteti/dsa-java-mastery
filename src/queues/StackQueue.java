package queues;

import java.util.Stack;

/**
 * Objective: Implement a FIFO Queue using two LIFO Stacks
 */
public class StackQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // ENQUEUE: Simply push to stack1
    public void enqueue(int x) {
        stack1.push(x);
    }

    // DEQUEUE: Move elements to stack2 to reverse the order
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? -1 : stack2.pop();
    }
}
