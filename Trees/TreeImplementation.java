package Trees;

import java.util.List;

import java.util.ArrayList;

class Node{
    int data;
    List<Node> children = new ArrayList<>();
    Node(int data){
        this.data = data;
    }
}

public class TreeImplementation {

    static void addChild(Node parent, Node child){
        parent.children.add(child);
    }


    //simple DFS traversal
    static void printTree(Node node, int level){
        if(node==null) return;
        for(int i=0; i<level; i++){
            System.out.print("--");
        }
        System.out.println(node.data);
        for(Node child : node.children){
            printTree(child, level+1);
        }
    }
    public static void main(String[] args){
        
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);
        addChild(root, child1);
        addChild(root, child2);
        addChild(child1, child3);
        printTree(root, 0); 

    }
}
