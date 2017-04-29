package as6;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Drawing extends JPanel
{
	public static final int WIDTH = 500;
	public static final int LENGTH = 600;
	
	private int xSize;
	private int ySize;

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
	private static JButton size10;
	private static JButton size20;

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
		size10 = new JButton("Size10");
		size20 = new JButton("Size20");
	    clearButton = new JButton("Clear"); 
		this.paintOn = false;
		this.xSize = 10;
		this.ySize = 10;
		this.addMouseListener(new MouseAdapter()
		{

			@Override
			public void mouseClicked(MouseEvent e)
			{
				setPaintOn(!isPaintOn());
			}

		});

		size10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				xSize = 10;
				ySize = 10;
				
				repaint();
			}
		});
		
		size20.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				xSize = 20;
				ySize = 20;
				
				repaint();
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
			d.fillOval(x, y, xSize, ySize);
			d.setColor(Color.BLUE);
		}

		for (Point point : redPoints)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, xSize, ySize);
			d.setColor(Color.RED);
		}

		for (Point point : greenPoints)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, xSize, ySize);
			d.setColor(Color.GREEN);
		}

		for (Point point : eraserPoints)
		{
			int x = (int) point.getX();
			int y = (int) point.getY();
			d.fillOval(x, y, xSize, ySize);
			d.setColor(Color.WHITE);
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
				buttons.add(size10);
				buttons.add(size20);
				frame.add(buttons, BorderLayout.SOUTH);
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