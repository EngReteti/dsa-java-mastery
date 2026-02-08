package queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Day 4: Mastering the Queue Data Structure (FIFO)
 */
public class QueueBasics {
    public static void main(String[] args) {
        // In Java, Queue is an interface, so we use LinkedList to implement it
        Queue<String> printerQueue = new LinkedList<>();

        // 1. ENQUEUE: Adding items to the back
        printerQueue.add("Project_Final.pdf");
        printerQueue.add("Resume_2026.docx");
        printerQueue.add("Instructions.txt");

        System.out.println("Current Queue: " + printerQueue);

        // 2. PEEK: See who is first in line
        System.out.println("Next to print: " + printerQueue.peek());

        // 3. DEQUEUE: Remove the first item
        String printed = printerQueue.poll(); 
        System.out.println("Printed and removed: " + printed);

        System.out.println("New Queue status: " + printerQueue);
    }
}

