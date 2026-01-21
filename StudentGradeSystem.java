import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🎓 Student Grade System 🎓 === \n");
        // Get student info 
        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("How many subjects?");
        int subjects = sc.nextInt();

        // Calculate total using FOR loop 
        int total = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter marks in subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        // Calculate average 
        double average = (double) total / subjects;

        // Determine grade using IF-ELSE 
        String grade;
        if (average >= 90) {
            grade = "A - Excellent!";
        } else if (average >= 75) {
            grade = "B - Very Good!";
        } else if (average >= 60) {
            grade = "C - Good!";
        } else if (average >= 40) {
            grade = "D - Pass";
        } else {
            grade = "F - Fail";
        }

        // Display results 
        System.out.println("\n=== 📊 Result for " + name + " ===");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        // Pass/Fail status 
        if (average >= 40) {
            System.out.println("Status: ✅ PASS");
        } else {
            System.out.println("Status: ❌ FAIL");
        }

        // Draw a simple progress bar 
        System.out.println("\nProgress Bar:");
        int bars = (int)(average / 10);
        for (int i = 1; i <= 10; i++) {
            if (i <= bars) {
                System.out.print("█");
            } else {
                System.out.print("░");
            }
        }
        System.out.println(" " + average + "%");

        sc.close();
    }
}