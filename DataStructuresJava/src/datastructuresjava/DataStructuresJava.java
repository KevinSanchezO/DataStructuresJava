/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructuresjava;

import BinarySearchTrees.BinaryTree;
import java.util.Random;
import java.util.Scanner;
import linkedlist.List;

/**
 *
 * @author Kevin Sánchez
 */
public class DataStructuresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainMenu();
    }
    
    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean operating = true;
        
        do{
            System.out.println("\nWelcome to this simple data structures code");
            System.out.println("1. Linked lists");
            System.out.println("2. Trees");
            System.out.println("3. Graphs");
            System.out.println("4. Hash tables");
            System.out.println("0. Exit");
            
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    linkedListsMenu();
                    break;
                case 2:
                    treesMenu();
                    break;
                case 3:
                    System.out.println("\nGraphs");
                    break;
                case 4:
                    System.out.println("\nHash tables");
                    break;
                case 0:
                    operating = false;
                    break;
                default:
                    System.out.println("\nInvalid option selected");
                    break;
            }
        } while (operating);
    }
    
    private static void linkedListsMenu() {
        List linkedList = new List();
        Scanner scanner = new Scanner(System.in);
        boolean operating = true;
        
        do {
            System.out.println("\nLinked list menu");
            System.out.println("1. Fill list");
            System.out.println("2. Show list");
            System.out.println("3. Apply sorting algorithm");
            System.out.println("0. Go back");
            
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    fillList(linkedList);
                    break;
                case 2:
                    linkedList.printList();
                    break;
                case 3:
                    applySortingAlgorithm(linkedList);
                    break;
                case 0:
                    operating = false;
                    break;
                default:
                    System.out.println("\nInvalid option selected");
                    break;
            }
        } while (operating);
        
    }
    
    private static void fillList(List linkedList) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("How many items do you want? [1-999]");
        int quantity = scanner.nextInt();
        
        if (0 < quantity && quantity < 1000) {
            for (int i = 0; i <= quantity; i++) {
                int randomNumber = rand.nextInt(9999) + 1;
                linkedList.addNode(randomNumber);
            }
            System.out.println("\nList filled");
        } else {
            System.out.println("\n Invalid quantity of elements1");
        }
    }
    
    private static void applySortingAlgorithm(List linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Merge Sort");
        int option = scanner.nextInt();
        
        switch (option) {
            case 1:
                linkedList.applyMergeSort();
                break;
            default:
                System.out.println("\nInvalid option selected");
                break;
        }
    }
    
    private static void treesMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean operating = true;
        
        do {
            System.out.println("\nChoose a type of tree");
            System.out.println("1. Binary Search Tree");
            System.out.println("0. Go back");
            
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    binarySearchTree();
                    break;
                case 0:
                    operating = false;
                    break;
                default:
                    System.out.println("\nInvalid option selected");
                    break;
            }
        } while (operating);
    }
    
    private static void binarySearchTree() {
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        boolean operating = true;
        
        do {
            System.out.println("\nBinary Search Tree");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Print");
            System.out.println("0. Go back");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    fillBinarySearchTree(binaryTree);
                    break;
                case 2:
                    
                    break;
                case 3:
                    binaryTree.print();
                    break;
                case 0:
                    operating = false;
                    break;
            }
        } while (operating);
    }
    
    
    //ONLY NUMBERS, I'm to lazy to make the validation rn
    //Maybe I won't do it, I'm doing this just to remember all these
    //structures
    private static void fillBinarySearchTree(BinaryTree binaryTree) {
        Scanner scanner = new Scanner(System.in);
        int item = 0;
        do {
            System.out.println("What item would you like to insert?");
            item = scanner.nextInt();
            binaryTree.insert(item);
            binaryTree.print();
        } while (item != 0);
    }
}
