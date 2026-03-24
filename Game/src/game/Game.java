
package game;

import java.util.Scanner;


public class Game {
static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Calling the methods into the main method.
        showWelcome();
        menu();
    }

    
    
    
    // This is the Welcome Screen method
    public static void showWelcome() {
        System.out.println("=====================================");
        System.out.println("     NUMBER GUESSING GAME 🎮");
        System.out.println("=====================================");
        System.out.println("Try to guess the correct number!\n");
    }

    // This is the Menu System method
    public static void menu() {
        int choice;

        do {
            System.out.println("-------- MAIN MENU --------");
            System.out.println("1. Start Game");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = getInput();

            switch (choice) {
                case 1:
                    System.out.println("\nStarting game...\n");
                    // Olwenkosi you must add your code here.
                    break;

                case 2:
                    System.out.println("\nExiting program...");
                    break;

                default:
                    System.out.println("\nInvalid option. Try again.\n");
            }

        } while (choice != 2);
    }

    // User Input Validation
    public static int getInput() {
        while (!input.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            input.next();
        }
        return input.nextInt();
       
    }
    
}
