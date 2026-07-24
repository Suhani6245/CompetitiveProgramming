package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Class representing a node in a General (N-ary) Tree
class TreeNode {
    int data;
    List<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class GeneralTree {
    TreeNode root;

    public GeneralTree() {
        this.root = null;
    }

    // 1. PRE-ORDER TRAVERSAL (Root -> Children from left to right)
    public void preOrder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        for (TreeNode child : node.children) {
            preOrder(child);
        }
    }

    // 2. POST-ORDER TRAVERSAL (Children from left to right -> Root)
    public void postOrder(TreeNode node) {
        if (node == null) return;

        for (TreeNode child : node.children) {
            postOrder(child);
        }
        System.out.print(node.data + " ");
    }

    /* 
       Note on In-Order Traversal: 
       Standard "In-order" does not naturally exist for general trees because 
       there is no single concept of a "middle". However, a common convention 
       is to visit the first child, then the root, then the remaining children.
    */
    public void inOrderConvention(TreeNode node) {
        if (node == null) return;

        if (!node.children.isEmpty()) {
            // Visit the first child
            inOrderConvention(node.children.get(0));
        }

        // Visit the root
        System.out.print(node.data + " ");

        // Visit the remaining children
        for (int i = 1; i < node.children.size(); i++) {
            inOrderConvention(node.children.get(i));
        }
    }

    // 3. LEVEL-ORDER TRAVERSAL / BFS
    public void levelOrder(TreeNode node) {
        if (node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            // Add all children of the current node to the queue
            for (TreeNode child : current.children) {
                queue.add(child);
            }
        }
    }

    public static void main(String[] args) {
        GeneralTree tree = new GeneralTree();

        /* 
           Manually creating the following General Tree:
                     1
                  /  |  \
                 2   3   4
                / \      |
               5   6     7
        */
        tree.root = new TreeNode(1);
        
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        
        tree.root.children.add(node2);
        tree.root.children.add(node3);
        tree.root.children.add(node4);

        node2.children.add(new TreeNode(5));
        node2.children.add(new TreeNode(6));

        node4.children.add(new TreeNode(7));

        System.out.println("--- Depth First Search (DFS) ---");
        
        System.out.print("Pre-order:  ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.print("In-order*:  ");
        tree.inOrderConvention(tree.root);
        System.out.println(" (Using first-child convention)");

        System.out.print("Post-order: ");
        tree.postOrder(tree.root);
        System.out.println("\n");

        System.out.println("--- Breadth First Search (BFS) ---");
        System.out.print("Level-order: ");
        tree.levelOrder(tree.root);
        System.out.println();
    }
}
