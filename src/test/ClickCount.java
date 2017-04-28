package test;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class ClickCount extends JFrame { 

	private JLabel countLabel;
	private JButton button;
	private JPanel mainPanel;
	private int count;

	private Container contentPane; 


	public ClickCount () {
		super("Count the Clicks!");

		// set the width and height of the window (in pixels)
		setSize(250,250);

		// get the content pane add a panel to it
		// set the background color of the panel (Color.??? constants)
		contentPane = getContentPane();
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.PINK);
		contentPane.add(mainPanel);

		count = 0;
		
		countLabel = new JLabel("Count: " + count);
		countLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
		mainPanel.add(countLabel);
		
		button = new JButton("Click Here!");
		mainPanel.add(button);
		button.addActionListener(new ButtonListener());
		
		
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			count++;
			countLabel.setText("Count: " + count);
			if(count%5==0) {
				Random generator = new Random();
				int r = generator.nextInt(256);
				int g = generator.nextInt(256);
				int b = generator.nextInt(256);
				Color randomColor = new Color(r, g, b);
				mainPanel.setBackground(randomColor);
			}
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					// create an object of your class
					ClickCount frame = new ClickCount();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}