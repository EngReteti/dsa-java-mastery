# 🚀 DSA Java Mastery: Logic Laboratory
![Java](https://img.shields.io/badge/Language-Java-orange) ![Environment](https://img.shields.io/badge/Tools-Termux-blue)

A professional repository dedicated to the implementation and optimization of fundamental Data Structures and Algorithms (DSA) using Java. This project serves as a technical showcase of algorithmic efficiency, memory management, and clean code principles.

## 🎯 Technical Objectives
* **Algorithm Optimization:** Strategic implementation of search and sort logic with a focus on Big O complexity.
* **Architecture:** Building custom, modular data structures from the ground up to understand memory allocation.
* **Defensive Engineering:** Implementing robust edge-case handling, such as stack/queue underflow protection.

## 📊 Complexity Analysis (Efficiency Standards)

| Data Structure | Best Case | Average Case | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Array (Search)** | (1)$ | (n)$ | (1)$ |
| **Binary Search** | (1)$ | (\log n)$ | (1)$ |
| **Bubble Sort** | (n)$ | (n^2)$ | (1)$ |
| **BST (Search)** | (1)$ | (\log n)$ | (n)$ |
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

## 💡 Technical Challenges & Solutions

### 1. Robust State Management
**Challenge:** Early iterations lacked validation, leading to `NullPointerException` when performing operations on empty data structures.
**Solution:** Integrated state-check logic across all LIFO/FIFO structures. Now, the system provides meaningful feedback (Underflow/Overflow warnings) instead of crashing.

### 2. Path & Classpath Resolution in CLI
**Challenge:** Executing Java files within nested directory structures caused `NoClassDefFoundError` due to package naming conflicts.
**Solution:** Standardized the project architecture using a clean source root (`src`) and utilized the `-cp` (classpath) flag for reliable execution from the terminal.

---

## 🚀 Getting Started

### Installation
```bash
git clone https://github.com/YOUR_USERNAME/dsa-java-mastery.git
cd dsa-java-mastery
```

### Execution Example
To run the **Graph BFS/DFS** logic:
```bash
javac src/graphs/GraphOperations.java
java -cp src graphs.GraphOperations
```

---
*Developed with a focus on algorithmic excellence in the Termux Linux environment.*
