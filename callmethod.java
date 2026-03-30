import java.util.Scanner;

public class callmethod {
// to call the add method   
    public static int addNumbers(int a, int b) {
        int result = a + b  ;
        return result ; 
    }
// to call the sub method    
public static int subNumbers(int a, int b){
    int result = a - b ; 
    return result ; 
}
// to call the multiply method
public static int multiplyNumbers(int a, int b){
    int result = a * b ; 
    return result ; 
}
// to call the divide method 
public static int divideNumbers(int a, int b){
    if (b == 0 ){
        System.out.println("Error : Division by zero is not allowed . ");
        return 0; }
    
    int result = a / b ; 
    return result ; 
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", tell me 2 numbers that I will calculate");
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation:\n1. Add\n2. Subtract\n3. Multiply\n4. Division");
        int opp = sc.nextInt();

        if (opp == 1) {
            int sum = addNumbers(num1, num2); 
            System.out.println("You chose Add. Result = " + sum);
       
        } else if (opp == 2) {
          int sum1 = subNumbers(num1,num2) ;
            System.out.println("You chose Subtract. Result = " + sum1);
        } else if (opp == 3 ){
            int sum2 = multiplyNumbers(num1 , num2 ) ;
            System.out.println("You chose to Multiply . \n Result  " + sum2 );
        }else if (opp == 4 ){
            int sum3 = divideNumbers(num1 , num2 ); 
            System.out.println("You chose to Divison  . \n Result  " + sum3 );
        }
        

        sc.close();
    }
}