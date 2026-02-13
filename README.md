# 🚀 DSA Java Mastery: Logic Laboratory
![Java](https://img.shields.io/badge/Language-Java-orange) ![Environment](https://img.shields.io/badge/Tools-Termux-blue)

A professional repository showcasing the implementation of fundamental Data Structures and Algorithms (DSA). This project focuses on building modular, efficient, and robust logic from the ground up using Java.

## 🎯 Technical Objectives
* **Algorithmic Efficiency:** Implementing search and sort logic with a strict focus on Big O complexity.
* **Structural Architecture:** Developing custom, non-linear data structures (Trees, Graphs) to master memory management.
* **Defensive Programming:** Ensuring code stability through robust edge-case handling and state validation.

## 📊 Complexity Analysis

| Data Structure | Operation | Average Complexity | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Array** | Search | (n)$ | (1)$ |
| **Binary Search** | Search | (\log n)$ | (1)$ |
| **Singly Linked List** | Insertion | (1)$ | (n)$ |
| **Binary Search Tree** | Traversal | (n)$ | (n)$ |
| **Graph** | BFS/DFS | (V+E)$ | (V)$ |

---

## 📸 System Gallery (Proof of Work)

| Feature | Visual Preview |
| :--- | :--- |
| **Array Operations** | ![Array Proof](docs/arrays_run.jpg) |
| **Linked List Operations** | ![Singly Linked List Proof](docs/linkedlists_run.jpg) |
| **Stack (LIFO) Logic** | ![Stack Proof](docs/stacks_run.jpg) |
| **Queue (FIFO) Logic** | ![Queue Proof](docs/queues_run.jpg) |
| **Searching Algorithms** | ![Search Proof](docs/searching_run.jpg) |
| **Sorting Algorithms** | ![Sort Proof](docs/sorting_run.jpg) |
| **Tree Traversals** | ![Tree Proof](docs/trees_run.jpg) |
| **Graph BFS/DFS** | ![Graph Proof](docs/graphs_run.jpg) |

---

## 💡 Technical Challenges & Solutions

### 1. Handling Underflow States
**Challenge:** Early logic would trigger a `NullPointerException` when attempting to pop or dequeue from empty structures.
**Solution:** Implemented defensive "empty checks" that return a graceful warning message, ensuring the program remains active and user-friendly.

### 2. Modular Classpath Execution
**Challenge:** Managing various Java files across different sub-directories led to compilation errors regarding package names.
**Solution:** Adopted a standardized source root (`src`) and utilized the `java -cp src` command to allow independent execution of any structure from the project root.

---

## 🚀 How to Run
1. **Clone the Repo:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/dsa-java-mastery.git
   cd dsa-java-mastery
   ```

2. **Compile and Execute (Example: Queues):**
   ```bash
   javac src/queues/QueueOperations.java
   java -cp src queues.QueueOperations
   ```

---
*Open for further expansion. Built with precision in a Termux Linux environment.*
