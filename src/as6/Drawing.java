package as6;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Drawing extends JPanel
{
	public static final int WIDTH = 500;
	public static final int LENGTH = 600;

	private static ArrayList<Point> bluePoints;
	private static ArrayList<Point> redPoints;
	private static ArrayList<Point> eraserPoints;
	private static ArrayList<Point> greenPoints;

	private boolean paintOn;

	private static JRadioButton greenRadioButton;
	private static JRadioButton blueRadioButton;
	private static JRadioButton redRadioButton;
	private static JRadioButton eraserRadioButton;
	private static JButton clearButton;

	public Drawing()
	{
		setBackground(Color.WHITE);

		greenPoints = new ArrayList<Point>();
		bluePoints = new ArrayList<Point>();
		redPoints = new ArrayList<Point>();
		eraserPoints = new ArrayList<Point>();
		greenRadioButton = new JRadioButton("Green");
		blueRadioButton = new JRadioButton("Blue");
		redRadioButton = new JRadioButton("Red");
		eraserRadioButton = new JRadioButton("Eraser");
		clearButton = new JButton("Clear");
		this.paintOn = false;
		this.addMouseListener(new MouseAdapter()
		{

			@Override
			public void mouseClicked(MouseEvent e)
			{
				setPaintOn(!isPaintOn());
			}

		});

		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				greenPoints = new ArrayList<Point>();
				bluePoints = new ArrayList<Point>();
				redPoints = new ArrayList<Point>();
				eraserPoints = new ArrayList<Point>();

				repaint();
			}
		});

		this.addMouseMotionListener(new MouseAdapter()
		{

			@Override
			public void mouseMoved(MouseEvent e)
			{
				if (isPaintOn())
				{
					if (blueRadioButton.isSelected())
					{
						Point point = e.getPoint();
						bluePoints.add(point);
					} else if (redRadioButton.isSelected())
					{
						Point point = e.getPoint();
						redPoints.add(point);
					} else if (greenRadioButton.isSelected())
					{
						Point point = e.getPoint();
						greenPoints.add(point);
					} else if (eraserRadioButton.isSelected())
					{

						Point point = e.getPoint();
						eraserPoints.add(point);
					}

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

		for (Point point : bluePoints)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, 10, 10);
			d.setColor(Color.BLUE);
		}

		for (Point point : redPoints)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, 10, 10);
			d.setColor(Color.RED);
		}

		for (Point point : greenPoints)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, 10, 10);
			d.setColor(Color.GREEN);
		}

		for (Point point : eraserPoints)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, 10, 10);
			d.setColor(Color.WHITE);
		}

	}

	private static class ClearButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			// greenPoints = new ArrayList<Point>();
			// bluePoints = new ArrayList<Point>();
			// redPoints = new ArrayList<Point>();
			// eraserPoints = new ArrayList<Point>();

			// repaint();
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
				JPanel buttons = new JPanel();
				buttons.add(greenRadioButton);
				buttons.add(blueRadioButton);
				buttons.add(redRadioButton);
				buttons.add(eraserRadioButton);
				buttons.add(clearButton);
				frame.add(buttons, BorderLayout.SOUTH);
				clearButton.addActionListener(new ClearButtonListener());
				ButtonGroup group = new ButtonGroup();
				group.add(greenRadioButton);
				group.add(blueRadioButton);
				group.add(redRadioButton);
				group.add(eraserRadioButton);
				frame.setVisible(true);
			}
		});

	}

}