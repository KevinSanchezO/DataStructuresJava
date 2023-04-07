/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTrees;

/**
 *
 * @author Kevin Sánchez
 */
public class BinaryTree {
    Node root;
    
    public BinaryTree() {
        this.root = null;
    }
    
    public void insert(int key) {
        this.root = insertNode(this.root, key);
    }
    
    private Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        
        if (key < root.getKey()) {
            root.setLeftNode(insertNode(root.getLeftNode(), key));
        } else if (key >= root.getKey()) {
            root.setRightNode(insertNode(root.getRightNode(), key));
        }
        
        return root;
    }
    
    public void print() {
        printTree(this.root, 0);
    }
    
    private void printTree(Node root, int depth) {
        if (root != null) {
            for (int i = 0; i < depth; i++) {
                System.out.print("...");
            }
            System.out.println(root.getKey());
            printTree(root.getLeftNode(), depth + 1);
            printTree(root.getRightNode(), depth + 1);
        }
    }
    
    public void delete(int key) {
        this.root = deleteTree(this.root, key);
    }
    
    private Node deleteTree(Node root, int key){
        return root;
    }
}
