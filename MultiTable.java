import java .util.Scanner;

public class MultiTable{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a Number");
     int num = sc.nextInt();

     System.out.println("\n=== Multiplication Table of "+ num + "===");

     for (int i =1 ; i<=10; i++){
     int result = num * i;
     System.out.println(num + " x " + i + "=" + result );
     }
     System.out.println("\n=== Counting Down ===");
     for (int i = 10 ;  i >= 1 ; i -- ) {
        System.out.println(i);
     }
    System.out.println( "Blast off! 🚀");
     
    sc.close();

    }
}

