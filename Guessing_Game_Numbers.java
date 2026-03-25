
package guessing_game_numbers;

import java.util.Scanner;


public class Guessing_Game_Numbers {
    public static int getValidNumber(Scanner scanner) {
            while (true) {
                System.out.print("Enter your guess: ");
                String input = scanner.next();
                
                try{
                    return Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    
                
                
                
                            System.out.println("Invalid input. Please enter a number.");
                            //This is the input validation in which the user enters the number intro the program
                            //If user enters a letter or invalid number the program will display the above message
                            
                            
                            }
                }
    }
    public static void displayResult (int attempts) {
        System.out.println("/n Congratulations !");
        System.out.println("You guessed the number!");
        System.out.println("Total attempts: = attempts");
        System.out.println("========================");
        //WHAT THE PROGRAM WILL PRINT OUT WHEN USER GUESSES THE CORRECT NUMBER
        //IF USER GETS NUMBER INCORRECT THE PROGRAM WILL SHOW THE AMMOUNT OF ATTEMPS LEFT
        //THIS IS THE RESULT DISPLAY
        
    }
    
    public static boolean replay (Scanner scanner) {
        System.out.print("/nDo you want to play again?  (yes/no):  ");
        //PROGRAM GOES IN A LOOP ONCE USER HAS WON THE GAME
        //USER WILL HAVE THE CHOICE TO EXIT OR CONTINUE
        String choice = scanner.next();
        
        return choice.equalsIgnoreCase("yes");
    }
    
}

    

        
        
           
                
    
    

        
        
      
                
           
   
        
    
