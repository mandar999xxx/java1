
import java.util.Random;
import java.util.Scanner;

public class guesinggame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand  = new Random();   // the random number generator 


        int secrectnum = rand.nextInt(100)+ 1;

        System.out.println("Welcome to the guessing game ! ");
        System.out.println("I have picked a  secrect number between 1 - 100 .   ");
            int attempts = 0 ; 
        while (true){
              attempts++;
            System.out.println("Hey user enter the numbere ");
            
       
      try {
          
       
           int guesed = sc.nextInt();
            if(guesed> secrectnum){
                System.out.println("Tooo high!");
            }
                
            else if(guesed < secrectnum){
                System.out.println("Too low !");
            }
                
            else if(guesed == secrectnum){
                System.out.println("You win!!!!!\n  ");
                System.out.println("Hey you guessed it at  "+ attempts + " great try !!");
                System.out.println("the end of the game   ");
                 break;
            }

        }

            catch (Exception e) {
                System.out.println("Oppss That is not a valid number bro . Try again !!");
                sc.nextLine();// use this  or this  will flush the out of the scanner so it doesn't loop forever
      }

                
     }
      sc.close();
  }

 }