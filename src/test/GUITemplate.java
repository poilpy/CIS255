/* 
 * This file provides a GUI shell for you to edit. 
 * Missing code marked with ??? must be replaced by you.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class /*??? CLASS NAME */ extends JFrame { 

	/*
	 * ??? Declare references to GUI components (labels, buttons, text fields, etc.), 
	 * objects (Strings, etc.), and primitive variables (int, double, etc.).
	 * 
	 */

	private Container contentPane; 


	public /* ??? CONSTRUCTOR NAME */ () {
		super("??? title bar text here");

		// set the width and height of the window (in pixels)
		setSize(???,???);

		// get the content pane add a panel to it
		// set the background color of the panel (Color.??? constants)
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(???);
		contentPane.add(mainPanel);

		/*
		 * ??? For EACH GUI component: a) construct the component,
		 * b) customize it, if necessary, c) add it to the main panel, 
		 * and d) add a listener, if necessary
		 * 
		 */

		
		/*
		 * ??? Initialize any other object or primitive variables you declared.
		 * 
		 */

	}

	/*
	 * Listener Classes This is a shell that can be copied as many times as
	 * needed. You will need to change the class name for each class.
	 * 
	 */
	private class /*??? LISTENER CLASS NAME */ implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// ??? what should happen when the action is taken
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					// create an object of your class
					/*??? CLASS NAME */ frame = new /* ??? CALL TO CONSTRUCTOR */;
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}