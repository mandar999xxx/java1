
import java.util.Scanner;

public class PasswordValidator {
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in );

       String correctPassword = "java2026";
       String password = "";
       int attempts = 0 ; 

      System.out.println("=== password System🔒 ===");

      while (!password.equals(correctPassword)){
        attempts++;
        System.out.println("Attempt " + attempts + "Enter password :");
        password = sc.nextLine();

    if (!password.equals(correctPassword)){
        System.out.println("X 🔒Wrong password ! Try again . \n");
    }
      }
      System.out.println("\n ✓Access is grtanted🔓 ");
      System.out.println("Your are right in "+ attempts + "attempts! ");

      sc.close();



    } 
}
