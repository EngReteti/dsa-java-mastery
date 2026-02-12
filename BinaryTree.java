class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // 1. Pre-order Traversal (Root -> Left -> Right)
    void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // 2. In-order Traversal (Left -> Root -> Right)
    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // 3. Post-order Traversal (Left -> Right -> Root)
    void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("--- Tree Traversal Logic ---");
        System.out.print("Pre-order: "); tree.preOrder(tree.root);
        System.out.print("\nIn-order: "); tree.inOrder(tree.root);
        System.out.print("\nPost-order: "); tree.postOrder(tree.root);
        System.out.println();
    }
}
