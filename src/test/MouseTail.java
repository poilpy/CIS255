package test;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MouseTail extends JPanel { 
	
	private LinkedList<Point> pointList;
	
	private final static int NUM_POINTS = 40;
	private final static int DIAMETER = 5;


	public MouseTail () {
		setBackground(Color.WHITE);
		pointList = new LinkedList<Point>();
		
		this.addMouseMotionListener(new MouseTailListener());

	}
	
	@Override
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		for(Point point : pointList) {
			int x = (int) point.getX();
			int y = (int) point.getY();
			pen.drawOval(x, y, DIAMETER, DIAMETER);
		}
		
	}
	
	private class MouseTailListener extends MouseAdapter {
		@Override
		public void mouseMoved(MouseEvent event) {
			Point point = event.getPoint();
			
			pointList.add(point);
			if(pointList.size() > NUM_POINTS) {
				pointList.remove(0);
			}
			repaint();
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new JFrame("Mouse Tail");
					frame.setSize(400,400);
					// create an object of your class
					MouseTail panel = new MouseTail();
					frame.getContentPane().add(panel);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });
	}
}