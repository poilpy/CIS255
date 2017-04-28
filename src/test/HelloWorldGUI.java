import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldGUI extends JFrame { 

	private JLabel helloLabel;
	private JButton clickButton;
	private JTextField nameField;
	private String message;
	private Container contentPane; 


	public HelloWorldGUI () {
		super("Hello World!");

		// set the width and height of the window (in pixels)
		setSize(200,200);

		// get the content pane add a panel to it
		// set the background color of the panel (Color.??? constants)
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.CYAN);
		contentPane.add(mainPanel);

		message = "Hello World!";
		helloLabel = new JLabel(message);
		//helloLabel.setForeground(Color.WHITE);
		mainPanel.add(helloLabel);
		
		clickButton = new JButton("Click Here!");
		clickButton.addActionListener(new ButtonListener());
		mainPanel.add(clickButton);
		
		//nameField = new JTextField("Enter name here");
		nameField = new JTextField(10);
		nameField.addActionListener(new ButtonListener());
		mainPanel.add(nameField);

	}


	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			/* first example- display upper case message */
			/*
			helloLabel.setText(message.toUpperCase());
			clickButton.setEnabled(false);
			*/
			
			/* second example- display user's name */
			String userText = nameField.getText();
			helloLabel.setText(message + " " + userText);
			clickButton.setEnabled(false);
			nameField.setEditable(false);
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					// create an object of your class
					HelloWorldGUI frame = new HelloWorldGUI();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}