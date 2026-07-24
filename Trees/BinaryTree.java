package Trees;
import java.util.LinkedList;
import java.util.Queue;

// Class representing a node in the binary tree
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // 1. PRE-ORDER TRAVERSAL (Root -> Left -> Right)
    public void preOrder(TreeNode node) {
        if (node == null) return;
        
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // 2. IN-ORDER TRAVERSAL (Left -> Root -> Right)
    public void inOrder(TreeNode node) {
        if (node == null) return;
        
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // 3. POST-ORDER TRAVERSAL (Left -> Right -> Root)
    public void postOrder(TreeNode node) {
        if (node == null) return;
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // 4. LEVEL-ORDER TRAVERSAL / BFS (Level by Level)
    public void levelOrder(TreeNode node) {
        if (node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* 
           Manually creating the following binary tree:
                     1
                   /   \
                  2     3
                 / \
                4   5
        */
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("--- Depth First Search (DFS) ---");
        
        System.out.print("Pre-order:  ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.print("In-order:   ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.print("Post-order: ");
        tree.postOrder(tree.root);
        System.out.println("\n");

        System.out.println("--- Breadth First Search (BFS) ---");
        System.out.print("Level-order: ");
        tree.levelOrder(tree.root);
        System.out.println();
    }
}
