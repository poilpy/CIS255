
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class RandomCirclesOriginal extends JPanel { 

	private static final int NUM_CIRCLES = 50;
	private static final int WIDTH = 400, HEIGHT = 400;
	
	private JButton redrawButton;
	private JCheckBox fillBox;
	private boolean filled;
	
	private JRadioButton blackWhiteButton, randomColorButton;
	private boolean drawInColor;
	
	public RandomCirclesOriginal () {
		setBackground(Color.WHITE);
		
		redrawButton = new JButton("Redraw");
		this.add(redrawButton);
		redrawButton.addActionListener(new DrawListener());
		
		fillBox = new JCheckBox("Filled?");
		this.add(fillBox);
		fillBox.addActionListener(new DrawListener());
		filled = false;
		
		blackWhiteButton = new JRadioButton("B&W");
		this.add(blackWhiteButton);
		blackWhiteButton.addActionListener(new DrawListener());
		
		randomColorButton = new JRadioButton("Color", true);
		this.add(randomColorButton);
		randomColorButton.addActionListener(new DrawListener());
		
		ButtonGroup group = new ButtonGroup();
		group.add(blackWhiteButton);
		group.add(randomColorButton);
		
		drawInColor = true;
		
	}
	
	private class DrawListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {			
			if(fillBox.isSelected()) {
				filled = true;
			} else {
				filled = false;
			}
			
			if(blackWhiteButton.isSelected()) {
				drawInColor = false;
			} else if(randomColorButton.isSelected()) {
				drawInColor = true;
			}
			
			repaint();
		}
	}
	
	@Override
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		for(int i=0; i<NUM_CIRCLES; i++) {
			Random generator = new Random();
			
			if(drawInColor) {
				int r = generator.nextInt(256);
				int g = generator.nextInt(256);
				int b = generator.nextInt(256);
				Color c = new Color(r, g, b);
				pen.setColor(c);
			} else {
				pen.setColor(Color.BLACK);
			}
			
			int x = generator.nextInt(WIDTH);
			int y = generator.nextInt(HEIGHT);
			int diameter = generator.nextInt(WIDTH/2);
			
			if(!filled) {
				pen.drawOval(x, y, diameter, diameter);
			} else {
				pen.fillOval(x, y, diameter, diameter);
			}
		}
		

		
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new JFrame("Circles!");
					frame.setSize(WIDTH,HEIGHT);
					// create an object of your class
					RandomCirclesOriginal panel = new RandomCirclesOriginal();
					frame.getContentPane().add(panel);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });
	}
}