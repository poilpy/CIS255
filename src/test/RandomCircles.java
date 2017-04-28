
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class RandomCircles extends JPanel { 

	private static final int NUM_CIRCLES = 50;
	private static final int WIDTH = 400, HEIGHT = 400;
	
	private boolean filled;
	private boolean drawInColor;
	
	public RandomCircles () {
		setBackground(Color.WHITE);
		filled = false;
		drawInColor = true;	
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
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public void setDrawInColor(boolean drawInColor) {
		this.drawInColor = drawInColor;
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new JFrame("Circles!");
					frame.setSize(WIDTH,HEIGHT);
					// create an object of your class
					RandomCircles panel = new RandomCircles();
					frame.getContentPane().add(panel, BorderLayout.CENTER);
					
					RandomCirclesControlPanel controlPanel = new RandomCirclesControlPanel(panel);
					frame.getContentPane().add(controlPanel, BorderLayout.SOUTH);
					
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });
	}
}