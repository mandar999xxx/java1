
import java.util.Scanner;

public class AgeCheker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System .in );

        System.out.println("Enter your age :");
        int age = sc. nextInt();

        if   (age >= 18) {                                       // Code runs if condition is TRUE
            System.out.println("You are an Adult . ");
            System.out.println("You can vote and drive . ");
        }

        else if   (age >= 13  ){                                // Runs if first condition is FALSE but this one is TRUE
            System.out.println("Your are a Teenageer .");
            System.out.println("Almost an Adult .");
        }

        else if  (age >= 5 ){
            System.out.println("Your are a kid ! ");
            System.out.println("Enjoy the school  kid !.");
        }
        
        else {                                                 // Runs if ALL conditions are FALSE
            System.out.println("You are toodler! ");
            System.out.println("Enjoy your childhood !.");
        }
    
   // Bonus check for voteing elegiblity 
   
        if (age >= 18 ) {
         System.out.println("\n You can vote in the Elections !.");
        }
        
        else {
            int yearsLeft  = 18 - age ;
            System.out.println("\n " + yearsLeft + " more years you can wait  until completion of 18 to  vote ! ");
        }
         sc.close();
        }
        }


