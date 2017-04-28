import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundGUI extends JPanel {
	
	private Point movingPoint;
	private int height, width;
	private int movingDistanceX, movingDistanceY;
	private int pointDiameter;
	private Timer timer;
	private int speed;
	
	public ReboundGUI() {
		setBackground(Color.pink);
		height = 300;
		width = 300;
		setPreferredSize(new Dimension(width, height));
		
		movingPoint = new Point(width/2+25,height/2);
		movingDistanceX = 1;
		movingDistanceY = 1;
		pointDiameter = 10;
		
		speed = 10;
		timer = new Timer(speed, new TimerListener());
		timer.start();
	
	}
	
	@Override
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		pen.setColor(Color.blue);
		pen.fillOval(movingPoint.x, movingPoint.y, pointDiameter, pointDiameter);
	}
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			movingPoint.x = movingPoint.x + movingDistanceX;
			movingPoint.y = movingPoint.y + movingDistanceY;
			if(movingPoint.x > width || movingPoint.x < 0) {
				movingDistanceX = movingDistanceX * -1;
			}
			if(movingPoint.y > height || movingPoint.y < 0) {
				movingDistanceY = movingDistanceY * -1;
			}
			repaint();
		}
	}
		

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rebound");

		ReboundGUI panel = new ReboundGUI();

		frame.getContentPane().add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
