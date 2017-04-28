import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SmileyGUI extends JPanel { 

	private final int EYE_DIAMETER = 30;
	
	private JButton colorButton;
	private Color eyeColor;

	public SmileyGUI () {
		setBackground(Color.WHITE);
		
		eyeColor = Color.GREEN;
		
		colorButton = new JButton("Change Color");
		this.add(colorButton);
		colorButton.addActionListener(new ButtonListener());
		
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(eyeColor == Color.GREEN) {
				eyeColor = Color.BLUE;
			} else {
				eyeColor = Color.GREEN;
			}
			repaint();
			System.out.println("eye color is " + eyeColor);
		}
	}
	
	@Override
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		// face
		pen.drawOval(20, 20, 200, 200);
		
		// left eye
		pen.setColor(eyeColor);
		pen.fillOval(60, 50, EYE_DIAMETER, EYE_DIAMETER);
		
		// right eye
		pen.setColor(eyeColor);
		pen.fillOval(160, 50, EYE_DIAMETER, EYE_DIAMETER);
		
		// nose
		pen.setColor(Color.BLACK);
		pen.drawOval(110, 110, EYE_DIAMETER/2, EYE_DIAMETER/2);
		
		// mouth
		pen.setColor(Color.RED);
		pen.fillRect(40, 160, 150, 20);
		
		pen.setColor(Color.BLACK);
		pen.drawString("Have a nice day!", 250, 250);
		
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new JFrame("My Smiley Face");
					frame.setSize(400,400);
					SmileyGUI panel = new SmileyGUI();
					frame.getContentPane().add(panel);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });
	}
}