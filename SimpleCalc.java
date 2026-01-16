import java.util.Scanner; // Imports the Scanner class from Java's utility package >> Allows reading user input from the keyboard

public class SimpleCalc { // difine the class name & class name should be match  as file name 

    /*

    Entry point of every Java program

    public: Accessible from anywhere

    static: Can be called without creating an object

    void: Doesn't return any value 

      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in );  // scanner it is used to whent the program is nedded the input form the output side 

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt (); 

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        // Performs addition, subtraction, multiplication, and division
        int sum = num1 + num2 ;     
        int difference = num1 -num2; 
        int product = num1 * num2;  
        double division = (double) num1 / num2 ; 

        System.out.println("\n=== Resulults ====");     // >>  \n this for new line  for better formating               

        // Concatenates numbers, operators, and results into readable output
        System.out.println(num1 + " + "+num2 + " = " +sum );
        System.out.println(num1 + " - " + num2+ " = "  + difference );
        System.out.println(num1 + " * "+ num2  + " = "+ product);
        System.out.println(num1 + " / "+ num2 + " = " + division);

        sc.close(); //Closes the Scanner to free system resources
    }
}