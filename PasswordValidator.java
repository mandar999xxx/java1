
import java.util.Scanner;

public class PasswordValidator {
   public static void main(String[] args) {
// Create Scanner object to read user input from keyboard
       Scanner sc = new Scanner (System.in );

  // Store the correct password (hardcoded for this example)
       String correctPassword = "java2026";

// Variable to store user's input password (starts empty)
       String password = "";

// Counter to track how many attempts user makes
       int attempts = 0 ; 


      System.out.println("=== 🔒password System🔒 ===");
// WHILE LOOP: Keep asking for password until user enters the correct one
// Condition: Continue looping while password is NOT equal to correctPassword
// The '!' means "NOT", so !password.equals(correctPassword) = "password not equal to correctPassword"
      while (!password.equals(correctPassword)){

// Increment attempt counter each time loop runs
        attempts++;

// Prompt user for password
        System.out.println("Attempt " + attempts + "Enter password :");
        password = sc.nextLine();

// Check if entered password is wrong
    if (!password.equals(correctPassword)){
        System.out.println("X 🔒 Wrong password ❌ ! Try again . \n");
    }
// Note: If password IS correct, this if-block won't execute
// The while loop condition will become false and loop will end
      }
// This line only executes AFTER while loop finishes (password is correct)
      System.out.println("\n ✅ ✓Access is grtanted 🔓 ");
      System.out.println("Your are right in "+ attempts + "attempts! ");
      System.out.println("Welcome.");

// Close Scanner to prevent resource leak
      sc.close();



    } 
}
