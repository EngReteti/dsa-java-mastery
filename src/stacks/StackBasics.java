package day03_stacks;

import java.util.Stack;

/**
 * Day 3: Mastering the Stack Data Structure
 */
public class StackBasics {
    public static void main(String[] args) {
        // Initialize the Stack
        Stack<Integer> myStack = new Stack<>();

        // 1. PUSH: Adding elements to the top
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // 2. PEEK: Looking at the top element without removing it
        System.out.println("Top element is: " + myStack.peek()); // Should be 30

        // 3. POP: Removing the top element
        System.out.println("Removed element: " + myStack.pop()); // Removes 30

        // 4. ISEMPTY: Checking if the stack is clear
        System.out.println("Is stack empty? " + myStack.isEmpty());
    }
}

