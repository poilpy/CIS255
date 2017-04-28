import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RubberLineGUI extends JPanel { 

	private Point startPoint, endPoint;
	private boolean selectingStartPoint;

	public RubberLineGUI () {
		setBackground(Color.WHITE);
		
		startPoint = null;
		endPoint = null;
		selectingStartPoint = true;

		this.addMouseListener(new RubberLineListener());
		this.addMouseMotionListener(new RubberLineListener());
	}
	
	@Override
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		if(startPoint != null && endPoint != null) {
			int startX = (int) startPoint.getX();
			int startY = (int) startPoint.getY();
			int endX = (int) endPoint.getX();
			int endY = (int) endPoint.getY();
			
			pen.drawLine(startX,  startY,  endX,  endY);
			
		}
	}

	private class RubberLineListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent event) {
			Point point = event.getPoint();
			if(selectingStartPoint) {
				startPoint = point;
				endPoint = null;
			//	selectingStartPoint = false;
			} else {
				endPoint = point;
			//	selectingStartPoint = true;
			}
			
			selectingStartPoint = !selectingStartPoint;
			repaint();
		}
		
		@Override
		public void mouseMoved(MouseEvent event) {
			Point point = event.getPoint();
			if(!selectingStartPoint) {
				endPoint = point;
				repaint();
			}
		}
	}
	
	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					JFrame frame = new JFrame("Rubber Line GUI");
					frame.setSize(400,400);
					RubberLineGUI panel = new RubberLineGUI();
					frame.getContentPane().add(panel);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });
	}
}