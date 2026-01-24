# Java Learning Repository
## 30 Days Java Learning Challenge

This repository contains my Java learning journey over 30 days.


## 📚 Table of Contents
1. [Simple Calculator](#-simple-calculator-program)
2. [Age Checker](#-age-checker-program)
3. [Multiplication Table](#-multiplication-table-generator-java-program)
4. [Project Structure](#-project-structure)
5. [Password Validator](#-password-validator-program)
6. [Pattern Printer ](#-pattern-printer-program)
7. [Student Grade ](#-student-grade-system-program)
8. [Array Basics](#-array-basics-program)
---

## 🧮 Simple Calculator Program
**File:** `SimpleCalc.java`

A basic Java calculator that performs:
- Addition
- Subtraction  
- Multiplication
- Division

### How to Run:
1. Compile: `javac SimpleCalc.java`
2. Run: `java SimpleCalc`

### Features:
- Takes two integer inputs from user
- Performs all four basic operations
- Displays formatted results

### To Improve/Add:
- Error handling for division by zero
- Support decimal numbers
- Add menu system
- Input validation

---

## 👤 Age Checker Program
**File:** `AgeChecker.java`

A program that categorizes users by age and checks voting eligibility.

### Features:
- Categorizes age into: Adult, Teenager, Kid, Toddler
- Checks voting eligibility
- Calculates years left to vote if underage
- Uses conditional statements (if/else if/else)

### How to Run:
1. Compile: `javac AgeChecker.java`
2. Run: `java AgeChecker`

### Concepts Learned:
- Conditional logic (if/else if/else)
- Comparison operators (>=, <, etc.)
- Multiple independent if-statements
- String concatenation with variables

### Sample Output:
        Enter your age: 16
         You are a Teenager.
         Almost an Adult.
         2 more years you can wait until completion of 18 to vote!

 

---

## 🔢 Multiplication Table Generator java program
**File:** `MultiTable.java`

A program that generates multiplication tables and counts down.

### Features:
- Takes a number input from user
- Generates multiplication table (1-10)
- Performs countdown from 10 to 1
- Uses `for` loops for iteration

### How to Run:
1. Compile: `javac MultiTable.java`
2. Run: `java MultiTable`

### Concepts Learned:
- `for` loops
- User input with Scanner
- String formatting in output
- Multiple loops in one program

### Sample Output:
        === Multiplication Table of 5===
        5 x 1=5
        5 x 2=10
        5 x 3=15
        5 x 4=20
        5 x 5=25
        5 x 6=30
        5 x 7=35
        5 x 8=40
        5 x 9=45
        5 x 10=50

        === Counting Down ===
        10
        9
        8
        7
        6
        5
        4
        3
        2
        1
        Blast off! 🚀

---

## 🔐 Password Validator Program
**File:** `PasswordValidator.java`

A program that validates passwords using a while loop.

### Features:
- Hardcoded correct password ("java2026")
- Unlimited attempts until correct
- Tracks number of attempts
- Provides feedback after each attempt

### Concepts Learned:
- `while` loops with condition
- String comparison using `.equals()`
- Counter variables for tracking attempts
- User input with Scanner
- Conditional statements inside loops

### Sample Output:

        === 🔒password System🔒 ===
        Attempt 1Enter password :
        hello
        X 🔒 Wrong password ❌ ! Try again . 

        Attempt 2Enter password :
        java2026

        ✅ ✓Access is grtanted 🔓 
        Your are right in 2attempts! 

---

## 🔢 Pattern Printer Program
**File:** `PatternPrinter.java`

A program that generates various patterns using nested for loops based on user input.

### Features:
- Takes number of rows as input
- Generates three different patterns:
  1. Right Triangle (star pattern)
  2. Square (star pattern) 
  3. Number Triangle (sequential numbers)
- Demonstrates nested loops in action

### How to Run:
1. Compile: `javac PatternPrinter.java`
2. Run: `java PatternPrinter`

### Concepts Learned:
- **Nested for loops** (loop inside another loop)
- **Outer loop** controls rows (`i` variable)
- **Inner loop** controls columns (`j` variable)
- **Pattern logic**: Relationship between row number and column count
- **Scanner** for user input

### Sample Output (for rows=4):
                Enter the number of rows :
                3

                === Pattern 1 : Right triangle ===
                * 
                * * 
                * * * 

                === Pattern 2: Square ===
                * * * 
                * * * 
                * * * 

                === Pattern 3 : Number Trinangle ===
                1 
                1 2 
                1 2 3 
                
---

## 📊 Student Grade System Program
**File:** 'StudentGradeSystem.java'

A program that calculates student grades and performance metrics based on subject marks.

### Features:
-Takes student name and number of subjects as input
-Collects marks for each subject
-Generates three different calculations:
-Total marks calculation
-Average percentage calculation
-Grade determination (A to F scale)
-Displays visual progress bar and pass/fail status
-Demonstrates multiple programming concepts in action

### How to Run:
-Compile: javac StudentGradeSystem.java
-Run: java StudentGradeSystem

### Concepts Learned:
- **FOR loops**for multiple subject marks entry
- **IF-ELSE** ladder for grade determination
- **Outer logic** controls input collection
- **Inner logic** controls calculation and display
- **Pattern logic**: Relationship between marks and grade categories
- **Scanner** for user input

### Sample outuput :
                === 🎓 Student Grade System 🎓 ===

                Enter student name:
                Alex Johnson
                How many subjects?
                3
                Enter marks in subject 1: 
                85
                Enter marks in subject 2: 
                92
                Enter marks in subject 3: 
                78

                === 📊 Result for Alex Johnson ===
                Total Marks: 255
                Average: 85.0
                Grade: B - Very Good!
                Status: ✅ PASS

                Progress Bar:
                ████████░░ 85.0%

---                
## 🔢 Array Basics Program

**File:** 'ArrayBasics.java'

A program that introduces fundamental array operations including input, display, and calculations.

### Features:
-Creates an integer array of size 5
-Takes 5 numbers as input from user
-Displays all entered numbers
-Calculates sum of all numbers
-Calculates average of the numbers
-Demonstrates array traversal with loops

### How to Run:
-Compile: javac ArrayBasics.java
-Run: java ArrayBasics

### Concepts Learned:
- **Array declaration and creation** (int[] numbers = new int[5])

- **Array indexing** (accessing elements with numbers[i])
- **FOR loops** with arrays for input and output
- **Array length** property (numbers.length)
- 0-based vs 1-based indexing (using i vs i+1)
- Accumulator pattern with arrays (sum += numbers[i])
- Type casting for accurate average calculation

### Sample Output:
                Enter 5 numbers:
                Number 1: 10
                Number 2: 20
                Number 3: 30
                Number 4: 40
                Number 5: 50

                You entered:
                Number 1: 10
                Number 2: 20
                Number 3: 30
                Number 4: 40
                Number 5: 50

                Sum: 150
                Average: 30.0
## 📁 Project Structure

                Java-Learning-Repo/
                │
                ├── SimpleCalc.java         # Day 2: Basic calculator
                ├── AgeChecker.java         # Day 3: Age categorization
                ├── MultiTable.java         # Day 4: Multiplication table
                ├── PasswordValidator.java  # Day 5: Password validation
                ├── PatternPrinter.java     # Day 6: Pattern generation
                ├── StudentGradeSystem.java # Day 7: Grade system 
                ├── * test day of 7 days    # Day 8 : TEST DAY ---
                ├── ArrayBasics.java        # Day 9 : Array workings  
                └── README.md


## 📅 Learning Progress
- **Day 1**: Repository setup and Git basics
- **Day 2**: Simple Calculator program
- **Day 3**: Age Checker with conditional logic  
- **Day 4**: Multiplication Table with loops
- **Day 5**: Password Validator with attemps 
- **Day 6**: Pattern printer 3 types 
- **Day 7**: Student Grade System Program
- **Day 8**: Test done of the what are things learned in this 7 days 
- **Day 9**: Array basics 