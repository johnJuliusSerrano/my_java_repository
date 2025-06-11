Serrano, John Julius B.
BSCS - 1A

**Lab 1 – Employee Information System**
**Description:**
A basic Java console application that gathers and displays employee details.

**Purpose:**
Practice foundational Java skills:

* Input/output using `Scanner`
* Simple arithmetic
* String formatting
* Output using `System.out.printf`

**Program Workflow:**

1. Ask for: First Name, Last Name, Age, Hours Worked, Hourly Wage
2. Combine names → Full Name
3. Calculate: `Daily Salary = hoursWorked × hourlyWage`
4. Display formatted output

**Sample Output:**

```
Employee Information:
----------------------
Full Name       : John Doe
Age             : 28 years old
Daily Salary    : PHP 800.00
```

---

**Lab 2 – Enhanced Employee Salary System**
**Description:**
An improved version of Lab 1 with detailed salary breakdown and formatting enhancements.

**Concepts Introduced:**

* Salary breakdown (Daily to Yearly)
* Tax and fixed deductions
* Retirement year calculation
* Name formatting using `.toUpperCase()`

**Salary Calculations:**

* Daily = hours × wage
* Weekly = daily × 5
* Monthly = weekly × 4
* Gross Yearly = monthly × 12
* Net Yearly = gross – (32% tax + ₱1500)
* Years to Retirement = 65 – age

**Sample Output:**

```
Employee Information
----------------------
Full Name           : DOE, JOHN
Age                 : 30 years old
Years to Retirement : 35 years
Daily Salary        : Php 800.00
Weekly Salary       : Php 4000.00
Monthly Salary      : Php 16000.00
Gross Yearly Salary : Php 192000.00
Net Yearly Salary   : Php 128640.00
```

---

**Lab 3 – Salary System with Conditional Logic**
**Description:**
Builds on Lab 2 by adding input validation and conditional logic using `if`, `else`, and `switch`.

**Features:**

* Age Validation:

  * Below 18 → Minor (Ineligible)
  * Above 65 → Senior (Ineligible)
* Hours Worked Validation: Must be between 1–24
* Job Role Input (1 = Manager, etc.)
* Salary Computation (same as Lab 2)
* Tax Rules:

  * > ₱250,000 → 32% tax + ₱1500
  * ≤ ₱250,000 → ₱1500 only

**Sample Output Includes:**

* Full Name (LAST, FIRST)
* Age
* Job Role
* Years to Retirement
* Salary Breakdown (Daily to Yearly)

---

**Lab 4 – Employee Information GUI (AWT)**
**Description:**
A Java AWT GUI version of Lab 1 that offers a more interactive experience.

**GUI Components:**

* Labels and TextFields for inputs
* Button to trigger calculation
* TextArea for displaying results
* Panels for layout
* WindowListener for proper exit behavior

**Input Validation:**

* Fields cannot be empty
* Age must be a positive integer
* Hours worked and hourly wage must be non-negative

**Output Example:**

```
Full Name: John Doe
Age: 30 years old
Daily Salary: PHP 1200.00
```

---

**Lab 5 – Java Quiz System (AWT)**
**Description:**
An AWT-based multiple-choice quiz app with interactive scoring.

**Features:**

* 3 Questions, each with 4 choices (A–D)
* `CheckboxGroup` ensures one answer per question
* “Next” button checks and validates input
* Final score shown after last question

**Interface Details:**

* Non-resizable window
* Styled with a blue header and readable font
* Disallows moving to the next question without answering

---

**Lab 6 – To-Do List Manager (Swing GUI)**
**Description:**
A simple Java Swing application to help users manage and track tasks.

**Features:**

* Displays tasks in a table with columns for:

  * Task Name
  * Task Description
  * Status (Not Started, Ongoing, Completed)
* “Add Task” button opens a form
* Uses `JComboBox` for selecting task status
* Form validation included
* Table cells are not editable

---

**Midterm Lab Exam – IT Ticket Management System**
**Description:**
A console-based ticket system for managing IT support requests using arrays and menus.

**Menu Options:**

1. Add Ticket (max 5 entries)
2. Update Ticket Status (Pending → In Progress or Resolved)
3. Show All Tickets
4. Generate Report (counts and summaries)
5. Exit

**Core Concepts:**

* Arrays and loops
* Input validation
* Status management
* Menu navigation with `do-while` or `while` loops

**Data Validations:**

* Urgency must be Low, Medium, or High
* Resolved tickets cannot be updated
* Max ticket limit: 5

---

**Final Project – Scientific Calculator with History (Swing GUI)**
**Description:**
A full-featured calculator built in Java Swing with advanced operations and history tracking.

**Features:**

* Basic Operations: +, −, ×, ÷, %, ^, √
* Decimal and negative number support
* Clear Buttons: AC, C, CE
* Toggle Sign (+/−)
* Scrollable history view
* Responsive layout with toggleable history panel

**Sample Calculations:**

```
8 + 2 = 10  
10 × 3 = 30  
√30 = 5.477  
```

**Error Handling:**

* Division by zero → displays “Error”
* Square root of negative number → displays “Error”
* Proper resets for new operations

