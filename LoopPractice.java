public class LoopPractice {
    public static void main(String[] args) {
        
        // Example 1: Count UP
        System.out.println("Counting 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        // Example 2: Count DOWN
        System.out.println("\nCounting 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Example 3: Even numbers
        System.out.println("\nEven numbers 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        
        // Example 4: Multiplication table
        System.out.println("\nTable of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}



/*

for (int i = 1;     i <= 10;       i++) {
    └────┬────┘     └──┬──┘        └┬┘
       ① Start     ② Condition    ③ Update
       
       */