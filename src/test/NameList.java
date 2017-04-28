import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class NameList extends JFrame { 

	private Container contentPane; 
	
	private JLabel instructionLabel;
	private JTextField nameField;
	private JTextArea displayArea;
	private JButton sortButton, clearButton;
	
	private ArrayList<String> nameList;


	public NameList () {
		super("Name Program");

		// set the width and height of the window (in pixels)
		setSize(200,400);

	
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		contentPane.add(mainPanel);

		instructionLabel = new JLabel("Enter a name:");
		mainPanel.add(instructionLabel);
		
		nameField = new JTextField(15);
		mainPanel.add(nameField);
		nameField.addActionListener(new NameListener());
		
		displayArea= new JTextArea(5, 10); // 5 rows, 10 columns
		displayArea.setEditable(false); // only using for output
		JScrollPane scrollPane= new JScrollPane(displayArea); // pass my text area object as a parameter
		// to the constructor of the JScrollPane object
		
		// then I add the *scrollPane* to the panel, instead of the text area
		mainPanel.add(scrollPane);
		
		clearButton = new JButton("Clear List");
		mainPanel.add(clearButton);
		clearButton.addActionListener(new NameListener());
		
		sortButton = new JButton("Sort List");
		mainPanel.add(sortButton);
		sortButton.addActionListener(new NameListener());
		
		nameList = new ArrayList<String>();		

	}


	private class NameListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()==nameField) {
				String name = nameField.getText();
				nameField.setText("");
				nameList.add(name);
			} else if(event.getSource()==clearButton) {
				nameList.clear();
			} else if(event.getSource()==sortButton) {
				Collections.sort(nameList);
			}
			displayNames();
		}
	}
	
	private void displayNames() {
		displayArea.setText("");
		for(String name: nameList) {
			displayArea.append(name);
			displayArea.append("\n");
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					NameList frame = new NameList();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}