// ### **⏱️ 15-30 min: Your Challenge**

// **Write a program that:**
// 1. Asks user for a number
// 2. Prints multiplication table of that number (1 to 10)
// 3. Uses a FOR loop

// **Test with:** 7

// **Expected output:**
// ```
// 7 x 1 = 7
// 7 x 2 = 14
// ...
// 7 x 10 = 70
import java.util.Scanner;

public class LoopExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of the table you want now we will genertate it :");
 int num1   = sc.nextInt()  ;  
 System.out.println("\nTable of "+ num1+":");
for (int i = 1  ; i<=10; i++){
    System.out.println( num1+"x" + i +"=" + (num1 * i) );
}
System.out.println("\sThank you for using multiplication table program \n|re run the program to get the  other tables that you want \b\n|Have a nice day| ");
sc.close();

    }
}
