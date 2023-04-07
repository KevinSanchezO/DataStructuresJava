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
    private int size;
    
    public List() {
        this.head = null;
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
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setPrev(current);
        }
        size++;
    }
    
    public void printList() {
        Node index = head;
        while (index != null) {
            System.out.println( index.getData() + " -> ");
            index = index.getNext();
        }
        System.out.println("[]");
    }
    
    /*
    =============== MERGE SORT ALGORITHM ===============
    O(n log n)
    The idea is to divide the linked list into halves recursively, sort 
    the two halves individually, and then merge them together.
    */
    
    public void applyMergeSort()  {
        long startTime = System.currentTimeMillis();
        
        Node sortedHead = mergeSort(this.head);
        this.head = sortedHead;
        long endTime = System.currentTimeMillis();
        printList();
        
        long timeTaken = endTime - startTime;
        
        System.out.println("\nTime Merge Sort algorithm: " + timeTaken);
    }
    
    //main method, splits the list into halfs to merge them sorted recursively
    private Node mergeSort(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        
        // Split the list into two halves.
        Node secondHalfHead = split(head);
        
        // Recursively sort both halves of the list.
        Node firstHalfSorted = mergeSort(head);
        Node secondHalfSorted = mergeSort(secondHalfHead);
        
        // Merge the sorted halves of the list.
        return merge(firstHalfSorted, secondHalfSorted);
    }
    
    //method to split into half the list, it uses a 
    private Node split(Node head) {
        Node slow = head;
        Node fast = head.getNext();
        
        while (fast != null) {
            fast = fast.getNext();
            if (fast != null) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
        }
        
        Node secondHalfHead = slow.getNext();
        slow.setNext(null);
        if (secondHalfHead != null) {
            secondHalfHead.setPrev(null);
        }
        return secondHalfHead;
    }
    
    private Node merge(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        Node result;
        if (first.getData() <= second.getData()) {
            result = first;
            result.setNext(merge(first.getNext(), second));
        } else {
            result = second;
            result.setNext(merge(first, second.getNext()));
        }
        result.getNext().setPrev(result);
        result.setPrev(null);
        return result;
    }
}
