// ============================================
// PROGRAM: StringMethods.java
// PURPOSE: Demonstrate basic String operations in Java
// AUTHOR: Java Learner
// DATE: Current Date
// ============================================

// IMPORT STATEMENTS
// -----------------
// import tells Java where to find additional classes we need
// Scanner is a class that helps us read input from the user
import java.util.Scanner;

// CLASS DECLARATION
// -----------------
// public - this class can be accessed from anywhere
// class - keyword to create a class
// StringMethods - name of our class (must match filename)
public class StringMethods {
    
    // MAIN METHOD - PROGRAM STARTS HERE
    // ---------------------------------
    // public - anyone can call this method
    // static - this method belongs to the class itself
    // void - this method doesn't return any value
    // main - special name that Java looks for when program starts
    // String[] args - command line arguments (we're not using them)
    public static void main(String[] args) {
        
        // ============================================
        // SECTION 1: SETTING UP INPUT
        // ============================================
        
        // Create a Scanner object to read keyboard input
        // Scanner - the type (like a blueprint)
        // sc - variable name (we can choose any name)
        // new - creates a new Scanner object
        // System.in - tells Scanner to read from keyboard
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter their name
        // System.out - standard output (your screen)
        // println - prints text and moves to next line
        System.out.println("Enter your name: ");
        
        // Read the name entered by user
        // String - data type for text
        // name - variable to store the text
        // sc.nextLine() - reads everything until user presses Enter
        String name = sc.nextLine();
        
        // Prompt user to enter a sentence
        System.out.println("Enter a sentence: ");
        
        // Read the sentence entered by user
        String sentence = sc.nextLine();
        
        // Print a header for our results
        // \n - creates a blank line (newline character)
        System.out.println("\n ===STRING OPERATIONS===");
        
        
        // ============================================
        // SECTION 2: BASIC STRING METHODS
        // ============================================
        
        // ---------- METHOD 1: length() ----------
        // Purpose: Counts how many characters are in a string
        // Returns: int (whole number)
        // Example: "Hello".length() → 5
        System.out.println("\n--- 1. LENGTH METHOD ---");
        
        // name.length() calls the length method on the name variable
        // The + operator joins (concatenates) text and numbers
        System.out.println("Name length: " + name.length() + " characters");
        
        // What's happening inside:
        // If name = "John", name.length() = 4
        // So it prints: "Name length: 4 characters"
        
        
        // ---------- METHOD 2: toUpperCase() and toLowerCase() ----------
        // Purpose: Convert text to all UPPERCASE or all lowercase
        // Returns: new String (original string is NOT changed)
        System.out.println("\n--- 2. CASE CONVERSION METHODS ---");
        
        // toUpperCase() converts every letter to capital
        System.out.println("Uppercase: " + name.toUpperCase());
        
        // toLowerCase() converts every letter to small
        System.out.println("Lowercase: " + name.toLowerCase());
        
        // IMPORTANT: These methods don't change the original!
        // name still has its original value
        System.out.println("Original name (unchanged): " + name);
        
        
        // ---------- METHOD 3: contains() ----------
        // Purpose: Check if a string contains specific characters
        // Returns: boolean (true or false)
        System.out.println("\n--- 3. CONTAINS METHOD ---");
        
        System.out.println("Checking if name contains letter 'a'...");
        
        // Method chaining: name.toLowerCase().contains("a")
        // Step 1: name.toLowerCase() converts to lowercase
        // Step 2: .contains("a") checks if lowercase version has 'a'
        // This makes it case-insensitive (finds both 'A' and 'a')
        if (name.toLowerCase().contains("a")) {
            // This runs if contains() returns true
            System.out.println("✓ Yes! The name contains 'a'");
        } else {
            // This runs if contains() returns false
            System.out.println("✗ No! The name does NOT contain 'a'");
        }
        
        // Example: name = "Rahul"
        // name.toLowerCase() → "rahul"
        // "rahul".contains("a") → true → prints "Yes!"
        
        // Example: name = "John"
        // name.toLowerCase() → "john"
        // "john".contains("a") → false → prints "No!"
        
        
        // ---------- METHOD 4: replace() ----------
        // Purpose: Replace all occurrences of one character/word with another
        // Returns: new String (original unchanged)
        System.out.println("\n--- 4. REPLACE METHOD ---");
        
        // replace(" ", "_") - replace all spaces with underscores
        System.out.println("Replacing spaces with underscores: " + name.replace(" ", "_"));
        
        // What happens:
        // If name = "John Doe" → "John_Doe"
        // If name = "John" (no spaces) → "John" (unchanged)
        
        // You can replace anything, not just spaces
        System.out.println("Replacing 'a' with '@': " + name.replace("a", "@"));
        
        
        // ---------- METHOD 5: substring() ----------
        // Purpose: Extract a part of a string
        // Returns: new String (a piece of the original)
        System.out.println("\n--- 5. SUBSTRING METHOD ---");
        
        // Always check length first to avoid errors!
        if (name.length() >= 3) {
            // substring(0,3) - start at index 0, end at index 3 (exclusive)
            // Indexes: 0,1,2 are included; index 3 is NOT included
            System.out.println("First 3 letters: " + name.substring(0, 3));
            
            // Visual example for "Jennifer":
            // Index:   0    1    2    3    4    5    6    7
            // Letters: J    e    n    n    i    f    e    r
            //          └──────────┬──────────┘
            //         substring(0,3) = "Jen"
        } else {
            System.out.println("Name is too short to extract 3 letters!");
        }
        
        // Other substring examples:
        if (name.length() >= 2) {
            // From index 1 to end
            System.out.println("From 2nd letter to end: " + name.substring(1));
        }
        
        
        // ============================================
        // SECTION 3: WORKING WITH SENTENCES
        // ============================================
        
        // ---------- METHOD 6: split() ----------
        // Purpose: Divide a string into pieces at specified delimiter
        // Returns: String[] (an array of strings)
        System.out.println("\n--- 6. SPLIT METHOD ---");
        
        // split(" ") - cut the sentence at every space
        // Returns an ARRAY of words
        String[] words = sentence.split(" ");
        
        // words.length tells us how many elements in the array
        System.out.println("Word count: " + words.length);
        
        System.out.println("Words in your sentence:");
        
        // FOR LOOP to go through each word in the array
        // for (start; condition; update)
        // i++ means increment i by 1 each time
        for (int i = 0; i < words.length; i++) {
            // i+1 makes the numbering start from 1 (not 0)
            // words[i] accesses the word at position i
            System.out.println((i + 1) + ". " + words[i]);
        }
        
        // Example: sentence = "Java is fun"
        // split(" ") → ["Java", "is", "fun"]
        // Loop runs 3 times:
        // i=0 → prints "1. Java"
        // i=1 → prints "2. is"
        // i=2 → prints "3. fun"
        
        
        // ============================================
        // SECTION 4: CLEANING STRINGS
        // ============================================
        
        // ---------- METHOD 7: trim() ----------
        // Purpose: Remove spaces from beginning and end of string
        // Returns: new String (without outer spaces)
        System.out.println("\n--- 7. TRIM METHOD ---");
        
        // Create a messy string with extra spaces
        String messy = "   hello   ";
        
        // Show what it looks like before trimming
        // Using [ ] to make spaces visible
        System.out.println("Before trim: [" + messy + "]");
        
        // Show after trim() removes outer spaces
        // trim() removes spaces at start and end, but not middle
        System.out.println("After trim:  [" + messy.trim() + "]");
        
        // Example: "   hello   ".trim() → "hello"
        // Example: "  hi  there  ".trim() → "hi  there" (middle space stays!)
        
        
        // ============================================
        // SECTION 5: CLEANUP
        // ============================================
        
        // Close the Scanner to free up resources
        // Always good practice!
        sc.close();
        
        // Final message
        System.out.println("\n✅ Program completed successfully!");
        
        
        // ============================================
        // BONUS: STRING FACTS
        // ============================================
        /*
        IMPORTANT THINGS TO REMEMBER:
        
        1. Strings are IMMUTABLE - they cannot be changed!
           Methods like toUpperCase() return NEW strings
           The original string stays the same
        
        2. Index starts at 0 - first character is position 0
           "Hello" → H(0), e(1), l(2), l(3), o(4)
        
        3. Always check length before using substring()
           To avoid StringIndexOutOfBoundsException
        
        4. split() returns an ARRAY - use it with loops
        
        5. contains() is case-sensitive
           Use toLowerCase() with it for case-insensitive search
        */
    }
}