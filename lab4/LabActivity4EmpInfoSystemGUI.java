import java.awt.*;
import java.awt.event.*;

public class LabActivity4EmpInfoSystemGUI {
	public static void main(String[] args) {
		Frame frame = new Frame("Laboratory Activity 4");
		frame.setLayout(new GridLayout(8, 2, 10, 5)); // 8 rows, 2 columns

		// Labels and input fields
		Label firstNameLabel = new Label("First Name:");
		TextField firstNameField = new TextField();

		Label lastNameLabel = new Label("Last Name:");
		TextField lastNameField = new TextField();

		Label ageLabel = new Label("Age:");
		TextField ageField = new TextField();

		Label hoursLabel = new Label("Hours Worked:");
		TextField hoursField = new TextField();

		Label rateLabel = new Label("Hourly Rate:");
		TextField rateField = new TextField();

		Button submitButton = new Button("Submit");
		Label outputTitleLabel = new Label("Output:");
		TextArea outputArea = new TextArea("", 50, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);

		// Add to layout
		frame.add(firstNameLabel);	
		frame.add(firstNameField);

		frame.add(lastNameLabel);	
		frame.add(lastNameField);

		frame.add(ageLabel);		
		frame.add(ageField);

		frame.add(hoursLabel);		
		frame.add(hoursField);

		frame.add(rateLabel);		
		frame.add(rateField);

		frame.add(new Label(""));	
		frame.add(submitButton);
		
		frame.add(outputTitleLabel);	
		frame.add(outputArea);

		// Submit action
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
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setResizable(false);

		// Exit handler
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
	}
}

