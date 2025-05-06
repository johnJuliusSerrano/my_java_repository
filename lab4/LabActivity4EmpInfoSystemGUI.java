import java.awt.*;
import java.awt.event.*;

public class LabActivity4EmpInfoSystemGUI {
	public static void main(String[] args) {
		Frame frame = new Frame("Laboratory Activity 4");
		frame.setLayout(new BorderLayout(10, 20)); // Main layout with gaps

		Panel formPanel = new Panel(new GridLayout(5, 2, 10, 5));
		TextField firstNameField = new TextField();
		TextField lastNameField = new TextField();
		TextField ageField = new TextField();
		TextField hoursField = new TextField();
		TextField rateField = new TextField();

		formPanel.add(new Label("First Name:"));
		formPanel.add(firstNameField);
		formPanel.add(new Label("Last Name:"));
		formPanel.add(lastNameField);
		formPanel.add(new Label("Age:"));
		formPanel.add(ageField);
		formPanel.add(new Label("Hours Worked:"));
		formPanel.add(hoursField);
		formPanel.add(new Label("Hourly Rate:"));
		formPanel.add(rateField);

		// Submit Button Panel
		Panel submitPanel = new Panel();
		Button submitButton = new Button("Submit");
		submitPanel.add(submitButton);

		// Center Container
		Panel centerContainer = new Panel(new BorderLayout(10, 10));
		centerContainer.add(formPanel, BorderLayout.NORTH);
		centerContainer.add(submitPanel, BorderLayout.CENTER);

		// Output Panel (South)
		Panel outputPanel = new Panel(new BorderLayout());
		outputPanel.add(new Label("Output:"), BorderLayout.NORTH);
		TextArea outputArea = new TextArea("", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		outputPanel.add(outputArea, BorderLayout.CENTER);

		// Add components to frame
		frame.add(centerContainer, BorderLayout.CENTER);
		frame.add(outputPanel, BorderLayout.SOUTH);

		// Submit action (unchanged logic)
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname = firstNameField.getText().trim();
				String lname = lastNameField.getText().trim();
				String ageStr = ageField.getText().trim();
				String hoursStr = hoursField.getText().trim();
				String rateStr = rateField.getText().trim();

				if (fname.isEmpty() || lname.isEmpty() || ageStr.isEmpty() ||
					hoursStr.isEmpty() || rateStr.isEmpty()) {
					outputArea.setText("Error: All fields must be filled out.");
					return;
				}
				
				try {
					int age = Integer.parseInt(ageStr);
				} catch (NumberFormatException ex) {
					outputArea.setText("Error: Age must be valid integer.");
					return;
				}

				try {
					double hours = Double.parseDouble(hoursStr);
					double rate = Double.parseDouble(rateStr);
				} catch (NumberFormatException ex) {
					outputArea.setText("Error: Hours worked and hourly rate must be valid numbers.");
					return;
				}
	
				try {
					int age = Integer.parseInt(ageStr);
					double hours = Double.parseDouble(hoursStr);
					double rate = Double.parseDouble(rateStr);
				
					String fullName = fname + " " + lname;
					double dailyWage = hours * rate;

					String output = "Full Name: " + fullName +
									"\nAge: " + age + " years old" +
									"\nDaily Salary: PHP " + String.format("%.2f", dailyWage);
					outputArea.setText(output);
				} catch (NumberFormatException ex) {
					outputArea.setText("Error: Invalid number format in age, hours, or rate.");
				}
			}
		});

		// Frame settings
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setResizable(false);

		// Window listener to exit
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
	}
}
