import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class GUIHiLo extends JFrame {

	private JLabel instructionsLabel, resultLabel;
	private JTextField inputField;
	private JButton playAgainButton;

	private int targetNumber;

	private Container contentPane;

	public GUIHiLo() {
		super("HiLo");

		// set the width and height of the window (in pixels)
		setSize(350, 200);

		// get the content pane add a panel to it
		// set the background color of the panel (Color.??? constants)
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.PINK);
		contentPane.add(mainPanel);

		instructionsLabel = new JLabel("Enter a number between 1-100 and hit enter to guess:");
		mainPanel.add(instructionsLabel);

		inputField = new JTextField(10);
		mainPanel.add(inputField);
		inputField.addActionListener(new GameListener());

		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Helvetica", Font.PLAIN, 18));
		mainPanel.add(resultLabel);

		playAgainButton = new JButton("Play Again");
		playAgainButton.setEnabled(false);
		mainPanel.add(playAgainButton);
		playAgainButton.addActionListener(new GameListener());

		chooseNumber();
	}
	
	private void chooseNumber() {
		Random generator = new Random();
		targetNumber = generator.nextInt(100) + 1;

	}

	private class GameListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == inputField) {
				int userGuess = Integer.parseInt(inputField.getText());

				if (userGuess < targetNumber) {
					resultLabel.setText("Too low!");
					inputField.setText("");
				} else if (userGuess > targetNumber) {
					resultLabel.setText("Too high!");
					inputField.setText("");
				} else { // userGuess == targetNumber
					resultLabel.setText("You've got it!");
					playAgainButton.setEnabled(true);
				}
			} else if(event.getSource()==playAgainButton) {
				playAgainButton.setEnabled(false);
				chooseNumber();
				resultLabel.setText("");
				inputField.setText("");
				
			}
		}
	}

	public static void main(String args[]) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				// create an object of your class
				GUIHiLo frame = new GUIHiLo();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}
}