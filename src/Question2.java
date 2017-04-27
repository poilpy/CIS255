import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.*;

public class Question2 extends JPanel
{

	Rectangle2D rect = new Rectangle2D.Double(400, 400, 100, 100);
	boolean inside;
	public static final int WIDTH = 1000;
	public static final int LENGTH = 1000;

	public Question2()
	{

		this.addMouseMotionListener(new MouseListener());

	}

	@Override
	protected void paintComponent(Graphics d)
	{
		super.paintComponent(d);

		Graphics2D d2 = (Graphics2D) d;

		if (inside)
		{
			d2.setColor(Color.GREEN);
			d2.fill(rect);
		} 
		else
		{
			d2.draw(rect);
		}
	}

	private class MouseListener extends MouseAdapter
	{
		@Override
		public void mouseMoved(MouseEvent e)
		{
			inside = rect.contains(e.getPoint());
			repaint();

		}
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new JFrame("Question2");
				frame.setSize(WIDTH, LENGTH);
				Question2 panel = new Question2();
				frame.getContentPane().add(panel);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}

}
