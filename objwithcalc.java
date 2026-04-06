
import java.util.Scanner;


class  mathsEngine {

    // action 1 
    int add(int a, int b ){     // if you dont give return this show the line has an error 
       int sum = a+b; 
       return sum; 
    }

    // action 2 
    int sub (int a , int b ){
        int sum = a-b; 
        return sum;
    }

    // action 3  
    int multiply (int a , int b ){
        int sum = a*b ; 
        return sum ; 
    }
    
    // action 4 
    int divide (int a , int b ){
        int sum = a/b ;
        return sum ; 
    }

}


public  class objwithcalc  {
    public static void main (String[]args){

Scanner sc = new  Scanner (System.in);

        while (true ){ 
System.out.println("Enter the  2 number that you want to calculate in this programs");

System.out.print("Enter the first number :");
int s = sc.nextInt();
System.out.print("Enter the second number :");
int  d = sc.nextInt();

System.out.println("Enter your the opperations by enter the number 1,2,3,4 \n 1.Add \n 2.Sub \n 3.Multiplty \n 4.Divide \n  "   );
int v = sc.nextInt();
System.out.println();
if (v== 1 ){
    mathsEngine myEngine = new mathsEngine();
int finalAnswer = myEngine.add(s,d);
System.out.println(finalAnswer);
}
if (v == 3 ){
    mathsEngine myEngine = new mathsEngine();
    int finalAnswer = myEngine.multiply(s, d);
    System.out.println(finalAnswer);
}
if (v== 2 ){
    mathsEngine myEngine = new mathsEngine(); 
    int finalAnswer = myEngine.sub(s, d);
    System.out.println(finalAnswer);
}
if (v == 4 ){
    mathsEngine myEngien = new mathsEngine();
    int finalAnswer = myEngien.divide(s, d);
 }
  else if  ( v== 5) {
    System.out.println("Hey you pressed the 5 to exit \n byee Thank you for using ");
    break ;

 }
else { System.out.println("may be you have done error see from your side ");

}
   }

sc.close();
   
  }               
}
    
    
