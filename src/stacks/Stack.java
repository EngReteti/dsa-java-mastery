public class Stack {
    private Node top;

    private class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    public int pop() {
        if (top == null) {
            System.out.println("⚠️ Stack Underflow! Cannot pop from empty stack.");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("⚠️ Stack is empty.");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(200);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        // Edge case test
        stack.pop(); 
    }
}
