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
	private static JRadioButton greenRadioButton;
	private static JRadioButton blueRadioButton;
	private static JRadioButton redRadioButton;
	private static JRadioButton eraserRadioButton;
	private static JButton clearButton;
	private static Color radioButtonCase;
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
			d.setColor(radioButtonCase);
		}
	}

	private static class RadioButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (greenRadioButton.isSelected())
			{
				radioButtonCase = Color.GREEN;
			} else if (blueRadioButton.isSelected())
			{
				radioButtonCase = Color.BLUE;
			} else if (redRadioButton.isSelected())
			{
				radioButtonCase = Color.RED;
			} else if (eraserRadioButton.isSelected())
			{
				radioButtonCase = Color.WHITE;
			} else
			{
				radioButtonCase = Color.WHITE;
			}
		}
	}

	private static class ClearButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			pointList.clear();
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
