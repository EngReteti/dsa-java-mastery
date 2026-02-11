class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class Stack {
    private Node top = null;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    public void peek() {
        if (top != null) System.out.println("Top element: " + top.data);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
