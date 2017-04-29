import java.awt.*;
import javax.swing.*;

public class Question1 extends JPanel
{
	public static final int WIDTH = 1000;
	public static final int LENGTH = 1000;

	public Question1()
	{
		setBackground(Color.WHITE);
	}

	public static void main(String args[])
	{

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new JFrame("Question1");
				frame.setSize(WIDTH, LENGTH);
				Question1 panel = new Question1();
				frame.getContentPane().add(panel);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

			}
		});
	}

	@Override
	protected void paintComponent(Graphics d)
	{
		super.paintComponent(d);

		d.setColor(Color.BLUE);
		d.fillRect(320, 320, 300, 300);

		d.setColor(Color.PINK);
		d.fillOval(5, 5, 300, 300);

		d.setColor(Color.BLUE);
		d.drawString("Sample text", 300, 300);

	}

}
