import java.util.Scanner;

public class LabActivity1EmployeeInformationSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String first_name = input.next();

		System.out.print("Enter your last name: ");
		String last_name = input.next();

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		System.out.print("Enter hours work: ");
		double hours_worked = input.nextDouble();

		System.out.print("Enter hourly wage: ");
		double hourly_wage = input.nextDouble();

		double salary = hours_worked * hourly_wage;

		System.out.println("\nEmployee Information");
		System.out.println("----------------------");
		System.out.println("Full Name  : " + first_name + " " + last_name);
		System.out.println("Age        : " + age + " years old");
		System.out.printf("Daily Salary: PHP %.2f%n", salary);

		input.close();
	}
}
