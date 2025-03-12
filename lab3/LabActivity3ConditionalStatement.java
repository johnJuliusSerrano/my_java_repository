// Serrano, John Julius B. (BSCS-1A)
import java.util.Scanner;

public class LabActivity3ConditionalStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Display prompt and store values
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		// Check if age is valid
		if (age < 18) {
			System.out.println("Minors are not allowed");
			System.exit(0);
		} else if (age >= 65) {
			System.out.println("Senior Citizens are not allowed");
			System.exit(0);
		}

		System.out.print("Enter hours worked: ");
		double hoursWorked = input.nextDouble();

		// Validate working hours
		if (hoursWorked > 24) {
			System.out.println("Number of hours worked cannot exceed 24 hours");
			System.exit(0);
		} else if (hoursWorked == 0) {
			System.out.println("Wrong input on daily work hours");
			System.exit(0);
		}

		System.out.print("Enter hourly wage: ");
		double hourlyWage = input.nextDouble();

		// Enter role code
		System.out.print("Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern): ");
		int roleCode = input.nextInt();
		String role;

		// Assign role based on input
		switch (roleCode) {
			case 1:
				role = "Manager";
				break;
			case 2:
				role = "Supervisor";
				break;
			case 3:
				role = "Staff";
				break;
			case 4:
				role = "Intern";
				break;
			default:
				role = "Undefined";
		}

		// Concatenate the first and last name
		String fullName = (lastName + ", " + firstName).toUpperCase();

		// Years to retirement
		int yearsToRetirement = Math.abs(65 - age);

		// Wage calculations
		long dailyWage = Math.round(hoursWorked * hourlyWage);
		long weeklyWage = dailyWage * 5;
		long monthlyWage = weeklyWage * 4;
		long grossYearlyWage = monthlyWage * 12;

		// Apply tax deduction if necessary
		double netYearlyWage = (grossYearlyWage > 250000) ? grossYearlyWage - (grossYearlyWage * 0.32) - 1500 : grossYearlyWage - 1500;

		// Print results
		System.out.println("\nEmployee Information");
		System.out.println("---------------------");
		System.out.println("Full Name: 			" + fullName);
		System.out.println("Age: 				" + age + " years old");
		System.out.println("Years to Retirement: 		" + yearsToRetirement + " years");
		System.out.println("Role: 				" + role);
		System.out.printf("Daily Salary: 			Php %,.2f%n", (double) dailyWage);
		System.out.printf("Weekly Salary: 			Php %,.2f%n", (double) weeklyWage);
		System.out.printf("Monthly Salary: 		Php %,.2f%n", (double) monthlyWage);
		System.out.printf("Gross Yearly Salary: 		Php %,.2f%n", (double) grossYearlyWage);
		System.out.printf("Net Yearly Salary: 		Php %,.2f%n", netYearlyWage);

		input.close();
	}
}
