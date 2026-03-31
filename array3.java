import java.util.Scanner;

class Student {
    String name;
    int marks;
}

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] classroom = new Student[3];

        System.out.println("--- Enter Student Details ---");

        for (int i = 0; i < 3; i++) {
            Student currentStudent = new Student();

            System.out.println("Enter name for student " + (i + 1) + ":");
            currentStudent.name = sc.nextLine(); 

            System.out.println("Enter marks for this student:");
            currentStudent.marks = sc.nextInt(); 
            
            sc.nextLine(); 

            classroom[i] = currentStudent; 
        }

        System.out.println("\n--- Classroom Roster ---");
        
        for (int i = 0; i < 3; i++) {
        
            System.out.println(classroom[i].name + " scored " + classroom[i].marks);
        }
        
        sc.close();
    }
}