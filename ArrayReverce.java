
import java.util.Scanner;

public class ArrayReverce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("how many numbers ? ");
    int size = sc.nextInt();

    int []numbers = new int [size];


    // input loop - get numbers form users 
    System.out.println("Enter "+ size + "numbers : ");
    for (int i = 0 ; i < numbers .length; i++){
        System.out.println("Numbers "+ (i + 1 )+ ":");
        numbers[i] = sc.nextInt(); 
    }
    // display original 
    System.out.println("\n original array : ");
    for (int i = 0 ; i < numbers.length; i++){
        System.out.println(numbers[i]+ " ");
    }
    // reverse the array 
    System.out.println("\n Reversed array : ");
    for (int i= numbers.length -1 ; i>=0; i--){
        System.out.println(numbers[i]+" ");
    }
    
    sc.close();
    }
}
