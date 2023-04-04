/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Kevin Sánchez
 */
public class List {
    private Node head;
    private Node tail;
    private int size;
    
    public List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int size() {
        return size;
    }
    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        this.tail = newNode;
        size++;
    }
}
