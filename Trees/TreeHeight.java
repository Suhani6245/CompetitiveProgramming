package Trees;


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

public class TreeHeight {
    // Method to calculate the height of the tree
    public int findHeight(Node node) {
        // Base case: An empty tree has a height of 0
        if (node == null) {
            return 0;
        }

        // Recursively find the height of left and right subtrees
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        // The height of the current node is 1 + the max of its subtrees
        return (Math.max(leftHeight, rightHeight) + 1);
    }



public static void main(String[] args) {
        TreeHeight treeHeight = new TreeHeight();

        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Finding the height of the tree
        int height = treeHeight.findHeight(root);
        System.out.println("Height of the tree: " + height); // Output: Height of the tree: 3
    }
}