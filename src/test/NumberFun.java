package test;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class NumberFun extends JFrame { 

	private JLabel instructionsLabel, totalLabel, maxLabel, minLabel, averageLabel;
	private JTextField inputField;
	private JButton calculateButton, clearButton;
	private ArrayList<Integer> numberList;

	private Container contentPane; 


	public NumberFun () {
		super("Fun with Numbers!");

		// set the width and height of the window (in pixels)
		setSize(275,400);

		// get the content pane add a panel to it
		// set the background color of the panel (Color.??? constants)
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		contentPane.add(mainPanel);

		instructionsLabel = new JLabel("Enter in numbers, one at a time:");
		mainPanel.add(instructionsLabel);
		
		inputField = new JTextField(10);
		mainPanel.add(inputField);
		inputField.addActionListener(new NumberListener());
		
		calculateButton = new JButton("Calculate Stats");
		mainPanel.add(calculateButton);
		calculateButton.addActionListener(new NumberListener());
		
		clearButton = new JButton("Clear the List");
		mainPanel.add(clearButton);
		clearButton.addActionListener(new NumberListener());
		
		totalLabel = new JLabel("Total: ");
		mainPanel.add(totalLabel);
		
		minLabel = new JLabel("Min:");
		mainPanel.add(minLabel);
		
		maxLabel = new JLabel("Max:");
		mainPanel.add(maxLabel);
		
		averageLabel = new JLabel("Average:");
		mainPanel.add(averageLabel);
		
		numberList = new ArrayList<Integer>();
		
	}


	private class NumberListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()==inputField) {
				int userNumber = Integer.parseInt(inputField.getText());
				numberList.add(userNumber);
				inputField.setText("");
				
			} else if(event.getSource()==calculateButton) {
				calculateStats();
				
			} else if(event.getSource()==clearButton) {
				numberList.clear();
			}
		}
	}
	
	private void calculateStats() {
		int total = 0;
		for(int n : numberList) {
			total += n;
		}
		
		double average = (total *1.0) / numberList.size();
		
		int min = Collections.min(numberList);
		int max = Collections.max(numberList);
		
		totalLabel.setText("Total: " + total);
		minLabel.setText("Min: " + min);
		maxLabel.setText("Max: " + max);
		averageLabel.setText("Average: " + average);
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					// create an object of your class
					NumberFun frame = new NumberFun();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}