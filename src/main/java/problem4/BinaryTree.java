package problem4;

public class BinaryTree {
    private Node root; // the root of the binary tree

    /** Print all nodes of the binary tree
     *  using inorder traversal */
    public void printInorder(Node node) {
        // FILL IN CODE
    }

    /** Return the number of nodes in a tree rooted at the given node */
    public int numNodes(Node node) {
        // FILL IN CODE

        return 0;
    }


    // ------- inner class Node -----
    private class Node {
        public int data; // value stored at the node
        public Node left; // left subtree
        public Node right;  // right subtree

        Node(int newdata) {
            data = newdata;
        }
    }

    public void createTree() {
        root  = new Node(12);
        root.left = new Node(15);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(25);
            /*
            12
             15
               1
               25
             6

             1 15 25 12 6
             */
    }

    public Node root() { return root; }

}
