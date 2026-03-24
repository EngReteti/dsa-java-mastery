package trees;

public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    void deleteKey(int key) { root = deleteRec(root, key); }

    Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            // Node with only one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: Get the inorder successor
            root.key = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void insert(int key) { root = insertRec(root, key); }
    Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);
        return root;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        for(int k : keys) tree.insert(k);

        System.out.println("Original Tree (In-order):");
        tree.inOrder(tree.root);
        
        System.out.println("\n\nDeleting 20 (Leaf)...");
        tree.deleteKey(20);
        tree.inOrder(tree.root);

        System.out.println("\n\nDeleting 30 (One child)...");
        tree.deleteKey(30);
        tree.inOrder(tree.root);

        System.out.println("\n\nDeleting 50 (Two children/Root)...");
        tree.deleteKey(50);
        tree.inOrder(tree.root);
    }
}
