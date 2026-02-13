# 🚀 DSA Java Mastery: Logic Laboratory
![Java](https://img.shields.io/badge/Language-Java-orange) ![Environment](https://img.shields.io/badge/Tools-Termux-blue)

A professional collection of Data Structures and Algorithms implemented in Java. This project showcases a deep understanding of memory management, algorithmic optimization, and defensive programming.

## 🎯 Project Objectives
* **Modular Logic:** Building data structures from scratch to understand underlying pointer/reference mechanics.
* **Efficiency Analysis:** Evaluating every algorithm through the lens of Time and Space complexity ($ notation).
* **Code Resilience:** Developing "crash-proof" logic that handles empty states and invalid inputs gracefully.

## 📊 Technical Complexity Analysis

| Structure/Algorithm | Best Case | Average Case | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Array Search** | (1)$ | (n)$ | (1)$ |
| **Binary Search** | (1)$ | (\log n)$ | (1)$ |
| **Bubble Sort** | (n)$ | (n^2)$ | (1)$ |
| **Binary Tree** | (1)$ | (\log n)$ | (n)$ |
| **Graph (BFS/DFS)** | (V+E)$ | (V+E)$ | (V)$ |

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

## 💡 Engineering Challenges & Solutions

### 1. The "Empty Structure" Vulnerability
* **Challenge:** Initial Stack and Queue implementations would crash with a `NullPointerException` if a "Pop" or "Dequeue" was attempted on empty data.
* **Analysis:** The code was attempting to access memory addresses that didn't exist (null references).
* **Solution:** Implemented **Defensive Programming**. I added conditional state-checks (`if (top == null)`) that return a custom "Underflow" warning. This keeps the application running instead of terminating unexpectedly.

### 2. Algorithmic Decision Making
* **Challenge:** Determining the most efficient way to locate data within a growing dataset.
* **Analysis:** Linear search becomes increasingly slow ((n)$) as the dataset expands.
* **Solution:** Implemented **Binary Search**. By ensuring data is sorted first, I utilized the "Divide and Conquer" strategy to cut search time to (\log n)$, significantly improving performance for large arrays.

### 3. CLI Environment Pathing
* **Challenge:** Running Java files from a nested directory structure caused `NoClassDefFoundError` in the Termux environment.
* **Analysis:** The Java Virtual Machine (JVM) was looking for class files relative to the current folder rather than the package root.
* **Solution:** Restructured the project using a standardized `src` root and executed all modules using the classpath flag (`java -cp src`). This ensures absolute path reliability across any terminal.

---

## 🚀 How to Execute
1. **Clone the project:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/dsa-java-mastery.git
   cd dsa-java-mastery
   ```
2. **Run a specific module (e.g., Searching):**
   ```bash
   javac src/searching/SearchAlgorithms.java
   java -cp src searching.SearchAlgorithms
   ```

---
*Maintained and expanded for continuous professional growth.*
