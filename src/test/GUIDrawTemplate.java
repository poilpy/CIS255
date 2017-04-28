/* 
 * This file provides a GUI shell for you to edit. 
 * Missing code marked with ??? must be replaced by you.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class /*??? CLASS NAME */ extends JPanel { 

	/*
	 * ??? Declare primitive variables (int, double, etc.).
	 * 
	 */

	public /* ??? CONSTRUCTOR NAME */ () {
		// set the background color
		setBackground(???);
		
		/*
		 * ??? Initialize any other object or primitive variables you declared.
		 * 
		 */

	}
	
	@Override
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		//	??? OTHER DRAWING CODE HERE
		
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new JFrame("??? Title of Frame");
					frame.setSize(???, ???);
					// create an object of your class
					/*??? CLASS NAME */ panel = new /* ??? CALL TO CONSTRUCTOR */;
					frame.getContentPane().add(panel);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });
	}
}