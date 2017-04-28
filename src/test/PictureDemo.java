import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PictureDemo extends JFrame { 

	private JLabel pictureLabel;
	private ImageIcon dogImage, catImage;
	private JCheckBox nameCheckBox;
	private JRadioButton dogRadioButton, catRadioButton;
	private Container contentPane; 
	private final String DOG_NAME = "Tessie";
	private final String CAT_NAME = "Zoom";
	private String currentName;


	public PictureDemo () {
		super("Picture Demo");

		// set the width and height of the window (in pixels)
		setSize(175,400);

		// get the content pane add a panel to it
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		contentPane.add(mainPanel);

		dogImage = new ImageIcon("dog.jpg");
		catImage = new ImageIcon("cat.jpg");
		
		pictureLabel = new JLabel(dogImage);
		currentName = DOG_NAME;
		pictureLabel.setText(currentName);
		pictureLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		pictureLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		mainPanel.add(pictureLabel);
		
		nameCheckBox = new JCheckBox("Display Name?", true);
		mainPanel.add(nameCheckBox);
		nameCheckBox.addActionListener(new PictureListener());
		
		dogRadioButton = new JRadioButton("Dog", true);
		mainPanel.add(dogRadioButton);
		dogRadioButton.addActionListener(new PictureListener());
		
		catRadioButton = new JRadioButton("Cat");
		mainPanel.add(catRadioButton);
		catRadioButton.addActionListener(new PictureListener());
		
		ButtonGroup group = new ButtonGroup();
		group.add(dogRadioButton);
		group.add(catRadioButton);
		

	}

	private class PictureListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			if(dogRadioButton.isSelected()) {
				pictureLabel.setIcon(dogImage);
				currentName = DOG_NAME;
			} else if(catRadioButton.isSelected()) {
				pictureLabel.setIcon(catImage);
				currentName = CAT_NAME;
			}
			
			if(nameCheckBox.isSelected()) {
				pictureLabel.setText(currentName);
			} else {
				pictureLabel.setText("");
			}
			
		}
	}

	public static void main(String args[]) {
	
			   EventQueue.invokeLater(new Runnable() {
				public void run() {
					PictureDemo frame = new PictureDemo();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			   });

		
	}
}