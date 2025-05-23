// Serrano, John Julius B.
// BSCS-1A
// MidtermExamDCIT23A

import java.util.Scanner;

public class MyMidtermLabExam {
	static final int MAX_TICKETS = 5; // max ticket would be 5
	static String[] issueDescriptions = new String[MAX_TICKETS]; // input issues 
	static String[] urgencyLevels = new String[MAX_TICKETS]; // input urgency level 
	static String[] statuses = new String[MAX_TICKETS]; // status of issues 
	static int ticketCount = 0; 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		// display Prompt option
		while (running) {
			System.out.println("\n=== IT Ticket System ===");
			System.out.println("1. Add Ticket");
			System.out.println("2. Update Ticket Status");
			System.out.println("3. Show All Tickets");
			System.out.println("4. Generate Report");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			// error message
			int choice;
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				scanner.nextLine();
			} else {
				System.out.println("Invalid input. Please enter a number from 1-5.");
				scanner.next();
				continue;
			}

			// option 
			switch (choice) {
				case 1:
					addTicket(scanner);
					break;
				case 2:
					updateTicketStatus(scanner);
					break;
				case 3:
					showTickets();
					break;
				case 4:
					generateReport();
					break;
				case 5:
					System.out.println("Exiting... Thank you!");
					running = false;
					break;
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 5.");
			}
		}

		scanner.close();
	}

	public static void addTicket(Scanner scanner) {
		if (ticketCount >= MAX_TICKETS) {
			System.out.println("Maximum number of tickets reached.");
			return;
		}

		System.out.print("Enter issue description: ");
		String description = scanner.nextLine();

		String urgency;
		while (true) {
			System.out.print("Enter urgency level (Low / Medium / High): ");
			urgency = scanner.nextLine();
			if (urgency.equalsIgnoreCase("Low") || urgency.equalsIgnoreCase("Medium") || urgency.equalsIgnoreCase("High")) {
				break;
			} else {
				System.out.println("Invalid urgency level. Please enter Low, Medium, or High.");
			}
		}

		issueDescriptions[ticketCount] = description;
		urgencyLevels[ticketCount] = urgency;
		statuses[ticketCount] = "Pending";
		ticketCount++;

		System.out.println("Ticket successfully added!");
	}

	public static void updateTicketStatus(Scanner scanner) {
		if (ticketCount == 0) {
			System.out.println("No tickets available to update.");
			return;
		}

		showTickets();
		System.out.print("Enter ticket number to update: ");

		int ticketNumber;
		if (scanner.hasNextInt()) {
			ticketNumber = scanner.nextInt();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input. Ticket number must be a number.");
			scanner.next();
			return;
		}

		if (ticketNumber < 1 || ticketNumber > ticketCount) {
			System.out.println("Invalid ticket number.");
			return;
		}

		int index = ticketNumber - 1;
		if (statuses[index].equalsIgnoreCase("Resolved")) {
			System.out.println("Cannot update a resolved ticket.");
			return;
		}

		System.out.print("Enter new status (In Progress / Resolved): ");
		String newStatus = scanner.nextLine();

		if (newStatus.equalsIgnoreCase("In Progress") || newStatus.equalsIgnoreCase("Resolved")) {
			statuses[index] = newStatus;
			System.out.println("Ticket status updated.");
		} else {
			System.out.println("Invalid status entered. Status not updated.");
		}
	}

	public static void showTickets() {
		if (ticketCount == 0) {
			System.out.println("No tickets to display.");
			return;
		}

		System.out.println("\n--- All Tickets ---");
		for (int i = 0; i < ticketCount; i++) {
			System.out.println((i + 1) + ". [" + urgencyLevels[i] + "] " + issueDescriptions[i] + " - Status: " + statuses[i]);
		}
	}

	public static void generateReport() {
		int pendingOrInProgress = 0;
		int resolved = 0;

		for (int i = 0; i < ticketCount; i++) {
			if (statuses[i].equalsIgnoreCase("Resolved")) {
				resolved++;
			} else {
				pendingOrInProgress++;
			}
		}

		System.out.println("\n=== Ticket Report ===");
		System.out.println("Total Tickets: " + ticketCount);
		System.out.println("Pending Tickets: " + pendingOrInProgress);
		System.out.println("Resolved Tickets: " + resolved);
	}
}

