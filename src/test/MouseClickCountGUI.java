package test;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class MouseClickCountGUI extends JPanel { 

	private ArrayList<Point> pointList;
	private JLabel countLabel;
	private int clickCount;
	
	public MouseClickCountGUI () {
		setBackground(Color.WHITE);
		
		pointList = new ArrayList<Point>();
		
		countLabel = new JLabel("Clicks: 0");
		countLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
		this.add(countLabel);
		this.clickCount = 0;
		
		this.addMouseListener(new ClickListener());

	}
	
	@Override
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		for(Point point : pointList) {
			int x = (int) point.getX();
			int y = (int) point.getY();
			pen.fillOval(x, y, 10, 10);
			pen.drawString("("+x+","+y+")", x,y);
		}
		
		
	}

	private class ClickListener extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent event) {
			Point point = event.getPoint();
			pointList.add(point);
			clickCount++;
			countLabel.setText("Clicks: " + clickCount);
			
			repaint();
		}
		
	}
	
	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new JFrame("All the Clicks!");
					frame.setSize(400,400);
					MouseClickCountGUI panel = new MouseClickCountGUI();
					frame.getContentPane().add(panel);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });
	}
}