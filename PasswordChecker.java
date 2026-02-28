
import java.util.Scanner;

public class PasswordChecker {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("___________________________");
    System.out.println("  PASSWORD STRENGTH CHECKER ");
    System.out.println("____________________________");

    String password = input.nextLine();
// Iitialize flags (boolean = true / false )
boolean hasUpper = false; 
boolean hasLower = false; 
boolean hasDigit = false; 
boolean hasSpecial = false; 
int strength = 0 ;

// Check length 
int length = password.length();
System.out.println("\n --- ANALYSIS ---");
System.out.println("Length : "+ length + "characters");

if (length >= 8 ) {
    strength++;
    System.out.println(" Good leangth(8+ characters) ");
}else {
    System.out.println(" Too short (need 8+ characters )");
}
  

    // check each charecter 
    for (int i = 0 ; i < length ; i++){
        char c = password.charAt(i);

    // check if  upercase  (A-Z) 
    if (c >= 'A' &&  c<= 'Z') {
        hasUpper = true ;
    }
    // check if lovercase (a-z)
    if (c >= 'a' && c <= 'z'){
        hasLower = true ;
    }
    // chek if digit (0-9)
    else if (c >= '0' && c <= '9'){
        hasDigit = true ; 
    }
    // Everything else is special character 

    else {
        hasSpecial = true; 
    } 
  }
// Count strengths 
if (hasUpper){
    strength++ ; 
    System.out.println("✓ Contains uppercase letters ");
} else {
    System.out.println("No uppercase letters ");
}
if (hasLower){
    strength++; 
    System.out.println("✓ Contains lowercase letters ");
}else {
    System.out.println("No lowercase letters ");
}

if (hasDigit){
    strength++; 
    System.out.println("✓ contains numbers");
}else {
    System.out.println("X No numbers ");
}


if  (hasSpecial){
    strength++;
    System.out.println("✓ Contains special characters ");
}else {
    System.out.println("X No special charecters ");
}


// Final rating 
System.out.println("\n ---  STREAGTH RATING ---");
if (strength == 5 ){
    System.out.println("🔥 VERY STRONG ! Excellent password ! ");
}else if (strength >= 3 ){
System.out.println("💪 STRONG! Good password ! ");
}else if  (strength >=2){
    System.out.println("⚠️ MEDIUM. Could be bettere. ");
}else {
    System.out.println("❌ WEAK ! Please improve your password ");
}

System.out.println("Score: "+ strength + "/5");
 }

 }
