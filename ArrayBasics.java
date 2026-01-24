import java.util.Scanner;  // Import Scanner class for user input

public class ArrayBasics {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        
        // Array Declaration and Creation:
        // Creates an integer array named 'numbers' that can hold 5 values
        // Syntax: dataType[] arrayName = new dataType[size]
        int[] numbers = new int[5];  // Array indexes: 0, 1, 2, 3, 4
        
        // Input Section: Get 5 numbers from user
        System.out.println("Enter 5 numbers:");
        
        // For loop to iterate through array indexes 0 to 4
        // We use i < 5 because array has 5 elements (0 through 4)
        for (int i = 0; i < 5; i++) {
            // Display prompt with human-friendly numbering (i+1)
            System.out.print("Number " + (i + 1) + ": ");
            
            // Store user input in array at position i
            // sc.nextInt() reads an integer from keyboard
            numbers[i] = sc.nextInt();
        }
        
        // Display Section: Show all entered numbers
        System.out.println("\nYou entered:");
        
        // Another for loop to traverse the array
        // Using numbers.length (which is 5) instead of hardcoding 5
        // This is better practice - works even if array size changes
        for (int i = 0; i < numbers.length; i++) {
            // Display each element with formatted output
            // i is computer index (starts at 0)
            // i+1 is human index (starts at 1)
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        
        // Calculation Section: Find sum of all numbers
        int sum = 0;  // Initialize accumulator variable to 0
        
        // Loop through array to add each element to sum
        for (int i = 0; i < numbers.length; i++) {
            // Accumulator pattern: sum = sum + numbers[i]
            sum += numbers[i];  // Shorthand for sum = sum + numbers[i]
        }
        
        // Calculate average
        // Type casting: Convert sum (int) to double for precise division
        // numbers.length is 5 (int), so we cast to double
        double average = (double) sum / numbers.length;
        
        // Output Results
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        
        // Close Scanner to prevent resource leak
        sc.close();
    }
}