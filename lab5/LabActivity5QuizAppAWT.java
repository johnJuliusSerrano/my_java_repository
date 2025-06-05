import java.awt.*;
import java.awt.event.*;

public class LabActivity5QuizAppAWT {
	public static void main(String[] args) {
		new QuizGUI();
	}
}

class QuizGUI {
	Frame frame;
	Panel mainPanel;
	Panel nestedPanel;
	Label question;
	Label response;
	Button nextButton;

	Checkbox[] choices = new Checkbox[4];
	CheckboxGroup group = new CheckboxGroup();

	int index = 0;
	int score = 0;

	QuizLogic logic = new QuizLogic();

	public QuizGUI() {
		frame = new Frame("Quiz app");
		frame.setSize(500, 300);
		frame.setResizable(false);

		mainPanel = new Panel(new GridLayout(4, 1));
		frame.add(mainPanel);

		question = new Label(logic.questions[index], Label.CENTER);
		question.setFont(new Font("Arial", Font.BOLD, 16));
		mainPanel.add(question);

		nestedPanel = new Panel(new GridLayout(2, 2));
		for (int i = 0; i < 4; i++) {
			choices[i] = new Checkbox(logic.option[index][i], group, false);
			choices[i].setFont(new Font("Dialog", Font.PLAIN, 13));
			choices[i].setForeground(Color.BLUE); 
			nestedPanel.add(choices[i]);
		}
		mainPanel.add(nestedPanel);

		response = new Label("", Label.CENTER);
		mainPanel.add(response);

		nextButton = new Button("Next");
		nextButton.setFont(new Font("Arial", Font.BOLD, 16)); 
		mainPanel.add(nextButton);

		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkbox selected = group.getSelectedCheckbox();
				if (selected == null) {
					response.setText("Please select an answer.");
					return;
				} else {
					group.setSelectedCheckbox(null);
					response.setText("");
				}

				int selectedIndex = -1;
				for (int i = 0; i < 4; i++) {
					if (selected == choices[i]) {
						selectedIndex = i;
						break;
					}
				}

				if (selectedIndex == logic.correctAnswer[index]) {
					score++;
				} 

				index++;

				if (index < logic.questions.length) {
					question.setText(logic.questions[index]);
					for (int i = 0; i < 4; i++) {
						choices[i].setLabel(logic.option[index][i]);
						choices[i].setState(false);
					}
				} else {
					question.setText("Quiz Completed!");
					response.setText("You got " + score + " out of " + logic.questions.length + " correct.");
					nextButton.setEnabled(false);
					for (Checkbox c : choices) {
						c.setEnabled(false);
					}
				}
			}
		});

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});

		frame.setVisible(true);
	}
}

class QuizLogic {
	String[] questions = {
		"What is the capital of France?",
		"Which language is used for Android development?",
		"What is the result of 2 + 2 * 2?"
	};

	String[][] option = {
		{"A. Paris", "B. Rome", "C. Berlin", "D. Madrid"},
		{"A. Swift", "B. Java", "C. Python", "D. Kotlin"},
		{"A. 6", "B. 8", "C. 4", "D. 10"}
	};

	int[] correctAnswer = {0, 3, 0};
}

