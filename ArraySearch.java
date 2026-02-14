
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System .in );

        int []scores = {85, 92 ,78, 95, 88 };

        // Display the array 
        System.out.println("Array ");
        for (int i =0 ; i< scores.length; i++){
            System.out.println(scores [i] + "");
        }
      System.out.println("\n\n Enter score to serach : ");
      int searchValue = sc.nextInt();

      //Search for the value 
      boolean found = false; 
      int position = - 1; 
      
      for (int i =0 ; i < scores.length ; i++){
        if (scores [i] == searchValue ){
            found = true; 
            position = i ; 
            break; // found it ! stop searching 
        }
      }
// Display results 
if (found){
    System.out.println("Found " + searchValue + "at position " + position);
}else{
    System.out.println("X" + searchValue + "not found in array");
}
  sc.close();
    }
}