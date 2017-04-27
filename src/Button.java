import javax.swing.*;
import java.awt.*;

public class Button extends JFrame
{
	private JLabel helloLabel;
	private JButton butt;
	private Container contentPane;

	public Button()
	{
		super("Hello");
		
		setSize(200, 200);
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.BLUE);
		contentPane.add(mainPanel);
		
		helloLabel = new JLabel("Hello b");
		mainPanel.add(helloLabel);
		
	}

}
