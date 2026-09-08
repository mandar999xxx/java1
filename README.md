# Java Learning Repository
## 30 Days Java Learning Challenge

This repository contains my Java learning journey over 17 days


## 📚 Table of Contents
1. [Simple Calculator](#-simple-calculator-program)
2. [Age Checker](#-age-checker-program)
3. [Multiplication Table](#-multiplication-table-generator-java-program)
4. [Project Structure](#-project-structure)
5. [Password Validator](#-password-validator-program)
6. [Pattern Printer ](#-pattern-printer-program)
7. [Student Grade ](#-student-grade-system-program)
8. [Array Basics](#-array-basics-program)
    - [Array Max/Min](#-array-maxmin-program)
    - [Array Reverse](#-array-reverse-program)
    - [Array Search](#-array-search-program)
9.  [Student Record System](#-student-record-system-program)
10. [Loop Exam (Multiplication Table Challenge)](#-loop-exam-multiplication-table-challenge-program)
11. [Additional Practice Programs](#-additional-practice-programs)
    - [The Pledge](#-the-pledge-program)
    - [Git Check](#-git-check-program)
    - [I'm Back](#-im-back-program)
12. [Project Structure](#-project-structure)
13. [Learning Progress](#-learning-progress)
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


---

## 📊 Array Operations Programs

### 🔍 Array Max/Min Program
**File:** `ArrayMaxMin.java`

Finds the maximum and minimum values in an array.

### Features:
- Takes array size and elements as input from the user.
- Iterates through the array to find the maximum element.
- Iterates through the array to find the minimum element.
- Displays both the maximum and minimum values.

### Sample Output:
                Enter the number of elements: 5
                Enter 5 numbers:
                15 8 23 4 42
                Maximum: 42
                Minimum: 4


---

### 🔄 Array Reverse Program
**File:** `ArrayReverse.java`

Reverses the order of elements in an array.

### Features:
- Takes array input from the user.
- Displays the original array.
- Reverses the array elements (either in-place or by creating a new array).
- Displays the reversed array.

### Sample Output:
                Original array: [10, 20, 30, 40, 50]
                Reversed array: [50, 40, 30, 20, 10]

---

### 🔎 Array Search Program
**File:** `ArraySearch.java`

Searches for a specific element within an array.

### Features:
- Takes array input from the user.
- Takes the element to search for as input.
- Performs a linear search through the array.
- Returns the position (index) if found, or a "not found" message.

### Sample Output:
                Enter 5 numbers: 10 25 30 45 50
                Enter number to search: 30
                30 found at position 3

## 📚 Student Record System Program
**File:** `StudentRecordSystem.java`

A program that manages a simple student record system using arrays. It stores student names and marks, displays all records, identifies the top student, and allows searching by name.

### Features:
- Stores data for 3 students (name and marks) using parallel arrays.
- Takes input for each student's name and marks.
- Displays all students with their marks.
- Finds and displays the student with the highest marks.
- Searches for a student by name (case-insensitive) and displays their marks if found.

### How to Run:
1. Compile: `javac StudentRecordSystem.java`
2. Run: `java StudentRecordSystem`

### Sample Output:
                ===STUDENTS RECORD SYSTEM===

                Enter the name of student1:
                Alice
                Enter the marks of Alice:
                85

                Enter the name of student2:
                Bob
                Enter the marks of Bob:
                92

                Enter the name of student3:
                Charlie
                Enter the marks of Charlie:
                78

                ===ALL STUDENTS===

                Alice-85marks

                Bob-92marks

                Charlie-78marks

                ===TOP STUDENT===
                Bob with 92 marks !

                Enter students name to search:
                Bob
                Found Bob-92marks

                
### Concepts Learned:
- **Parallel arrays** to store related data (names and marks).
- **For loops** for input, display, and finding maximum.
- **String comparison** using `equalsIgnoreCase()` for case-insensitive search.
- **Scanner** with buffer handling (`nextLine()` after `nextInt()`).
- **Conditional logic** (`if` statements) for finding top student and search.
- **Boolean flag** to track if a student was found during search.

## 🔢 Multiplication Table (Loop Exam) Program
**File:** `LoopExam.java`

A simple program that generates the multiplication table for a given number using a `for` loop. This program was created as part of a coding challenge to practice loop fundamentals.

### Features:
- Asks the user to enter a number.
- Prints the multiplication table of that number from 1 to 10.
- Uses a `for` loop for iteration.
- Displays a friendly thank‑you message after the table.

### How to Run:
1. Compile: `javac LoopExam.java`
2. Run: `java LoopExam`

### Sample Output (with input `7`):
                Enter the number of the table you want now we will generate it:
                7

                Table of 7:
                7x1=7
                7x2=14
                7x3=21
                7x4=28
                7x5=35
                7x6=42
                7x7=49
                7x8=56
                7x9=63
                7x10=70
                Thank you for using multiplication table program
                |re run the program to get the other tables that you want
                |Have a nice day|

### Concepts Learned:
- **`for` loop** – initialization, condition, increment.
- **Scanner** – taking integer input from the user.
- **String concatenation** – building output lines inside the loop.
- **Basic arithmetic** – multiplying the input number by the loop counter.
- **User interaction** – prompt messages and closing the scanner.


## 📁 Project Structure
                Java-Learning-Repo/
                │
                ├── SimpleCalc.java          # Basic calculator operations
                ├── AgeChecker.java          # Age categorization & voting eligibility
                ├── MultiTable.java          # Multiplication table generator
                ├── PasswordValidator.java   # Password validation with attempts
                ├── PatternPrinter.java      # Pattern generation (stars, numbers)
                ├── StudentGradeSystem.java  # Grade calculation & progress bar
                ├── ArrayBasics.java         # Basic array operations (I/O, sum, avg)
                ├── ArrayMaxMin.java         # Find max and min in array
                ├── ArrayReverse.java        # Reverse array elements
                ├── ArraySearch.java         # Search for an element in array
                ├── StudentRecordSystem.java # Student records with parallel arrays
                ├── LoopExam.java            # Multiplication table challenge
                ├── thepledge.java           # Simple program for basic syntax practice
                ├── gitcheck.java            # Program to accompany Git concept practice
                ├── iamback.java             # Simple "welcome back" program
                └── README.md                # Project documentation (Java in 30 days)

---

## 📅 Learning Progress

| Day | Program(s) | Concepts Learned |
| :-- | :--- | :--- |
| Day 1 | Repository Setup | Git basics, README creation |
| Day 2 | `SimpleCalc.java` | `Scanner`, arithmetic operations |
| Day 3 | `AgeChecker.java` | `if`/`else if`/`else`, comparison operators |
| Day 4 | `MultiTable.java` | `for` loops, string formatting |
| Day 5 | `PasswordValidator.java` | `while` loops, string comparison (`.equals()`) |
| Day 6 | `PatternPrinter.java` | Nested `for` loops, pattern logic |
| Day 7 | `StudentGradeSystem.java` | Integrating multiple concepts |
| Day 8 | Review & Test | Assessment of concepts learned (Days 1-7) |
| Day 9 | `ArrayBasics.java` | Array declaration, indexing, traversal |
| Day 10 | `ArrayMaxMin.java` | Array traversal for comparison logic |
| Day 11 | `ArrayReverse.java` | Array manipulation and indexing |
| Day 12 | `ArraySearch.java` | Linear search algorithm |
| Day 13 | `StudentRecordSystem.java` | Parallel arrays, search logic, buffer handling |
| Day 14 | `LoopExam.java` | `for` loop practice, challenge implementation |
| Ongoing | `thepledge.java`, `gitcheck.java`, `iamback.java` | Syntax reinforcement, Git practice |

---
## 🚀 How to Use This Repository

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/Java-Learning-Repo.git
    ```

2.  **Navigate to the directory:**
    ```bash
    cd Java-Learning-Repo
    ```

3.  **Compile any Java program:**
    ```bash
    javac ProgramName.java
    ```

4.  **Run the compiled program:**
    ```bash
    java ProgramName
    ```

---

## 📌 Notes

- Each program is self-contained and designed to demonstrate specific concepts.
- Comments within the code explain key logic and syntax.
- Feel free to clone the repository, experiment with the code, and use it for your own learning.

---

**Happy Coding!** ☕
