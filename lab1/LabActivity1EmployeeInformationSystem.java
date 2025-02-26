// Serrano, John Julius B. (BSCS-1A)
import java.util.Scanner;

public class LabActivity1EmployeeInformationSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Display prompt and store value 
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		System.out.print("Enter hours worked: ");
		double hoursWorked = input.nextDouble();

		System.out.print("Enter hourly wage: ");
		double hourlyWage = input.nextDouble();

		// Concatenating the first and last name to get full name
		String fullName = firstName + " " + lastName;

		// Calculate the salary by multiplying hours worked and hourly wage
		double salary = hoursWorked * hourlyWage;

		// Print out and display the result
		System.out.println("\nEmployee Information");
		System.out.println("----------------------");
		System.out.println("Full Name  : " + fullName);
		System.out.println("Age        : " + age + " years old");
		System.out.printf("Daily Salary: PHP %.2f%n", salary);

		// Close the scanner
		input.close();
	}
}

