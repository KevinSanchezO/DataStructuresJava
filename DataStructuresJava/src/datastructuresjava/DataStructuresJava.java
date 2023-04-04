/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructuresjava;

import java.util.Scanner;

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
            System.out.println("5. Exit");
            
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nLinked list");
                    break;
                case 2:
                    System.out.println("\nTrees");
                    break;
                case 3:
                    System.out.println("\nGraphs");
                    break;
                case 4:
                    System.out.println("\nHash tables");
                    break;
                case 5:
                    operating = false;
                    break;
                default:
                    System.out.println("\nInvalid option selected");
                    break;
            }
        } while (operating);
    }
    
    private void linkedListsMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean operating = true;
        
    }
}
