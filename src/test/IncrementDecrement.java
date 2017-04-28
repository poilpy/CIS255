import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncrementDecrement extends JFrame { 

	private JButton incButton, decButton;
	private JLabel countLabel;
	private JTextField intervalField;
	private int count;

	private Container contentPane; 


	public IncrementDecrement () {
		super("Incrementing and Decrementing Fun!");

		// set the width and height of the window (in pixels)
		setSize(300,300);

		// get the content pane add a panel to it
		// set the background color of the panel (Color.??? constants)
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.YELLOW);
		contentPane.add(mainPanel);

		count = 0;
		
		countLabel = new JLabel(Integer.toString(count));
		countLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
		mainPanel.add(countLabel);
		
		incButton = new JButton("Increment");
		mainPanel.add(incButton);
		incButton.addActionListener(new ButtonListener());
		
		decButton = new JButton("Decrement");
		mainPanel.add(decButton);
		decButton.addActionListener(new ButtonListener());
		
		JLabel intervalInstructionLabel = new JLabel("Enter a new interval:");
		mainPanel.add(intervalInstructionLabel);
		
		intervalField = new JTextField(5);
		intervalField.setText("1");
		mainPanel.add(intervalField);

	}


	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String intervalString = intervalField.getText();
			int interval;
			if(intervalString.equals("")) {
				interval = 1;
				intervalField.setText("1");
			} else {
				interval = Integer.parseInt(intervalString);
			}
			
			if(event.getSource()==incButton) {
				count = count + interval;
			} else if(event.getSource()==decButton) {
				count = count - interval;
			}
			countLabel.setText(Integer.toString(count));
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					// create an object of your class
					IncrementDecrement frame = new IncrementDecrement();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}