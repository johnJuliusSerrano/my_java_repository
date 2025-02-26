// import Scanner to handle input
import java.util.Scanner;

public class LabActivity1EmployeeInformationSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Display prompt and store value 
		System.out.print("Enter your first name: ");
		String first_name = input.nextLine();

		System.out.print("Enter your last name: ");
		String last_name = input.nextLine();

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		System.out.print("Enter hours work: ");
		double hours_worked = input.nextDouble();

		System.out.print("Enter hourly wage: ");
		double hourly_wage = input.nextDouble();

		// Concatenating the first and last name toget full name
		String full_name = first_name + " " + last_name;

		// Calculate the salary by multiplying hours worked and hourly wage
		double salary = hours_worked * hourly_wage;

		// Print out and display the result
		System.out.println("\nEmployee Information");
		System.out.println("----------------------");
		System.out.println("Full Name  : " + full_name);
		System.out.println("Age        : " + age + " years old");
		System.out.printf("Daily Salary: PHP %.2f%n", salary);

		// close the scanner
		input.close();
	}
}
