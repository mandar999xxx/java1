
import java.util.Scanner;

public class PatternPrinter {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.println("Enter the number of rows :");
    int rows = sc.nextInt();

    // Pattern 1: Right Triangle 
    System.out.println("\n === Pattern 1 : Right triangle ===");
    for (int i =1; i<=rows ; i++){
        for (int j=1 ; j<= i; j++){
            System.out.print("* ");

        } 
        System.out.println();
    }
 // Pattern 2 : square 
 System.out.println("\n === Pattern 2: Square ===");
 for (int i=1 ; i<=rows; i++){
    for (int j=1; j<= rows; j++){
        System.out.print("* ");
    }
    System.out.println();
 }

 // Pattern 3 : Number Triangle 
 System.out.println("\n === Pattern 3 : Number Trinangle in the pattern  ===");
 for (int i=1 ; i<=rows ; i++){
    for (int j =1; j<=i; j++){
        System.out.print(j +" ");
    }
   System.out.println(); 
}
sc.close();


} 
}
