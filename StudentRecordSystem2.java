
import java.util.Scanner;

public class StudentRecordSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

          // Arrays to store data 
        String [] names = new String[3];
        int [] marks = new int[3];
        
       // Input of the students 
        System.out.println("===STUDENTS RECORD SYSTEM===\n");
        for (int i = 0 ; i< 3; i ++){
            System.out.println("Enter the name of student"+ (1 + i )+ ":");
            names [i] = sc.nextLine();
              

            System.out.println("Enter the marks of "+ names[i]+ ";");
            marks[i] = sc.nextInt();
            sc.nextLine(); // Clear buffer 
            System.out.println();
        }
      
        // Display all students 
        System.out.println("\n ===ALL STUDENTS===");
        for (int i =0; i < 3; i++ ){
            System.out.println((i + 1 )+ "." + names[i]+ "-" + marks[i]+ "marks");
        }
        
        // Find the marks 
        int maxMarks = marks[0];
        String topstudent = names[0];

        for (int i = 1 ; i< 3 ; i++) {
            if (marks[i]> maxMarks){
                maxMarks = marks[i];
                topstudent = names[i];
            }
        }

        System.out.println("\n ===TOP STUDNENTS ===");
        System.out.println(topstudent+ " with "+ maxMarks + " marks ! ");

        // Search for a students 
        System.out.println("\n Enter students name to search : ");
        String searchName = sc.nextLine();

        boolean found =false; 
        for (int i =0 ; i <3 ; i++){
            if (names [i]. equalsIgnoreCase(searchName)){
                System.out.println(" Found " + names[i]+ "-" + marks[i] + "marks ");
                found= true; 
                break;
            }
        }
        if (!found){
            System.out.println("X Student not found");
        }
        sc.close();
    }
}
