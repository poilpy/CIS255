package as6;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Drawing extends JPanel
{
	public static final int WIDTH = 500;
	public static final int LENGTH = 600;

	private ArrayList<Point> pointList;

	private boolean paintOn;

	public Drawing()
	{
		setBackground(Color.WHITE);

		pointList = new ArrayList<Point>();
		this.paintOn = false;
		this.addMouseListener(new MouseAdapter()
		{

			@Override
			public void mouseClicked(MouseEvent e)
			{
				setPaintOn(!isPaintOn());
			}

		});

		this.addMouseMotionListener(new MouseAdapter()
		{

			@Override
			public void mouseMoved(MouseEvent e)
			{
				if (isPaintOn())
				{
					Point point = e.getPoint();
					pointList.add(point);

					repaint();
				}
			}
		});

	}

	public boolean isPaintOn()
	{
		return paintOn;
	}

	public void setPaintOn(boolean paintOn)
	{
		this.paintOn = paintOn;
	}

	@Override
	protected void paintComponent(Graphics d)
	{
		super.paintComponent(d);

		for (Point point : pointList)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, 10, 10);
		}
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new JFrame("Drawing");
				frame.setSize(WIDTH, LENGTH);
				Drawing panel = new Drawing();
				frame.getContentPane().add(panel);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}

}
