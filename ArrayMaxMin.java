
import java.util.Scanner; // Import Scanner class for user input

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in );// Create Scanner object

        System.out.println("How many numbers ?  ");
        int size = sc.nextInt();  // User decides array size


        int [] numbers = new int [size]; // Array created with user-specified size
        
        // input numbers     
        System.out.println("Enter"+ size + "numbers ");
        for (int i =0 ; i < numbers.length; i++){
            System.out.println("Numbers "+ (i+1)+ ":");
            numbers[i]= sc.nextInt();    // Store each number in array
        }
        
        // To find the maximum 
        int max = numbers[0];   // Assume first element is largest
        for (int i =1 ; i< numbers.length; i++){
            if (numbers[i] > max){
                max = numbers [i];   // Update max if larger number found
            }
        }

        // Find minimum ; 
       int min = numbers[0]; // Assume first element is smallest
       for (int i = 1 ; i < numbers.length; i++ ){
        if( numbers[i]< min ){
            min = numbers [i];   // Update min if smaller number found
        }
       }
       // To display results numbers ; 
System.out.println("\n=== Restult === ");
System.out.println("Maximum "+ max );
System.out.println("Minimum "+ min );
System.out.println("Range: "+ (max-min));  // Range: Difference between largest and smallest number

sc.close();
}
}