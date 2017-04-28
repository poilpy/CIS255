import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormInput extends JFrame { 

	private JTextField nameField, ageField;
	private JRadioButton maleButton, femaleButton;
	private JCheckBox studentBox;
	private JButton submitButton;
	private JTextArea resultsArea;

	private Container contentPane; 


	public FormInput () {
		super("Information");

		// set the width and height of the window (in pixels)
		setSize(180,400);


		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setLayout(new GridLayout(7,1));
		contentPane.add(mainPanel);

		JLabel instructions = new JLabel("Enter your information:");
		JPanel instructionsPanel = new JPanel();
		instructionsPanel.add(instructions);
		mainPanel.add(instructionsPanel);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new GridLayout(2,1));
		JLabel nameLabel = new JLabel("Name:");
		JPanel namePanel2 = new JPanel();
		namePanel2.add(nameLabel);
		namePanel.add(namePanel2);
		nameField = new JTextField(15);
		namePanel.add(nameField);
		mainPanel.add(namePanel);
		
		JPanel agePanel = new JPanel();
		agePanel.setLayout(new GridLayout(2,1));
		JLabel ageLabel = new JLabel("Age:");
		agePanel.add(ageLabel);
		ageField = new JTextField(15);
		agePanel.add(ageField);
		mainPanel.add(agePanel);
		
		JPanel genderPanel = new JPanel();
		maleButton = new JRadioButton("Male");
		genderPanel.add(maleButton);
		femaleButton = new JRadioButton("Female");
		genderPanel.add(femaleButton);
		mainPanel.add(genderPanel);
		
		ButtonGroup group = new ButtonGroup();
		group.add(maleButton);
		group.add(femaleButton);
		
		JPanel studentPanel = new JPanel();
		studentBox = new JCheckBox("Student");
		studentPanel.add(studentBox);
		mainPanel.add(studentPanel);
		
		JPanel submitPanel = new JPanel();
		submitButton = new JButton("Submit Form");
		submitPanel.add(submitButton);
		mainPanel.add(submitPanel);
		submitButton.addActionListener(new FormListener());

		JPanel areaPanel = new JPanel();
		resultsArea = new JTextArea(5,15);
		resultsArea.setEditable(false);
		areaPanel.add(resultsArea);
		mainPanel.add(areaPanel);
		
	}


	private class FormListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			resultsArea.setText("");
			resultsArea.append("Name: " + nameField.getText() + "\n");
			resultsArea.append("Age: " + ageField.getText() + "\n");
			if(maleButton.isSelected()) {
				resultsArea.append("Gender: Male\n");
			} else if(femaleButton.isSelected()) {
				resultsArea.append("Gender: Female\n");
			}
			if(studentBox.isSelected()) {
				resultsArea.append("Student");
			}
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					FormInput frame = new FormInput();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}