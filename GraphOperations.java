import java.util.*;

public class GraphOperations {
    private int V;
    private LinkedList<Integer> adj[];

    GraphOperations(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) { adj[v].add(w); }

    // 1. BFS Traversal
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // 2. DFS Traversal
    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int n : adj[v]) {
            if (!visited[n]) DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        GraphOperations g = new GraphOperations(4);
        g.addEdge(0, 1); g.addEdge(0, 2);
        g.addEdge(1, 2); g.addEdge(2, 0);
        g.addEdge(2, 3); g.addEdge(3, 3);

        System.out.println("Graph Adjacency List Created.");
        System.out.print("BFS (starting from vertex 2): "); g.BFS(2);
        System.out.print("\nDFS (starting from vertex 2): "); g.DFS(2);
        System.out.println();
    }
}
