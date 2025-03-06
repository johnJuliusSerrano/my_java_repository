// Serrano, John Julius B. (BSCS-1A)
import java.util.Scanner;

public class LabActivity2EmployeeInformationSystemPart2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Display prompt and store value
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter your age: ");
		short age = input.nextShort();

		System.out.print("Enter hours worked: ");
		byte hoursWorked = input.nextByte();

		System.out.print("Enter hourly wage: ");
		double hourlyWage = input.nextDouble();

		// Concatenating the first and last name to get full name
		String fullName = (lastName + ", " + firstName).toUpperCase();

		// Years to retirement (use Math.abs to handle ages above 65)
		short yearsToRetirement = Math.abs(65 - age);

		// Daily wage (rounded to the nearest whole number)
		long dailyWage = Math.round(hoursWorked * hourlyWage);

		// Weekly wage = daily wage * 5
		long weeklyWage = dailyWage * 5;

		// Monthly wage = weekly wage * 4
		long monthlyWage = weeklyWage * 4;

		// Gross yearly wage = monthly wage * 12
		long grossYearlyWage = monthlyWage * 12;

		// Net yearly wage = gross yearly - 32% - 1500
		double netYearlyWage = grossYearlyWage - (grossYearlyWage * 0.32) - 1500.0;

		// Print out and display the results
		System.out.println("\nEmployee Information");
		System.out.println("---------------------");
		System.out.println("Full Name: 			" + fullName);
		System.out.println("Age: 				" + age + " years old");
		System.out.println("Years to Retirement: 		" + yearsToRetirement + " years");
		System.out.printf("Daily Salary: 			Php %,.2f%n", (double) dailyWage);
		System.out.printf("Weekly Salary: 			Php %,.2f%n", (double) weeklyWage);
		System.out.printf("Monthly Salary: 		Php %,.2f%n", (double) monthlyWage);
		System.out.printf("Gross Yearly Salary: 		Php %,.2f%n", (double) grossYearlyWage);
		System.out.printf("Net Yearly Salary: 		Php %,.2f%n", netYearlyWage);

		input.close();
		}
}
