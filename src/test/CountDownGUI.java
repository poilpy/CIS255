import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CountDownGUI extends JFrame {
	
	private Container myCP;
	private JTextField counterDisplay;
	private JButton stopButton, startButton;
	
	private Timer timer;
	
	private int counter;
	private int initialCount = 10;
	private int speed;
	
	public CountDownGUI() {
		super("Counting Down!");
		
		myCP = getContentPane();
		setLayout(new FlowLayout());
		
		setSize(300, 300);
		setBackground(Color.white);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		counterDisplay = new JTextField(20);
		counterDisplay.setEditable(false);
		myCP.add(counterDisplay);
		
		counter = initialCount;
		counterDisplay.setText(Integer.toString(counter));
		
		startButton = new JButton("Start");
		startButton.setEnabled(false);
		myCP.add(startButton);
		startButton.addActionListener(new ButtonListener());
		
		stopButton = new JButton("Stop");
		stopButton.setEnabled(true);
		myCP.add(stopButton);
		stopButton.addActionListener(new ButtonListener());
		
		speed = 500; // 1000 milliseconds is 1 second
		timer = new Timer(speed, new TimerListener());
		timer.start();
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object source = event.getSource();
			if(source == startButton) {
				timer.start();
				startButton.setEnabled(false);
				stopButton.setEnabled(true);
			} else if(source == stopButton) {
				timer.stop();
				stopButton.setEnabled(false);
				startButton.setEnabled(true);
			}
		}
	}
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(counter > 0) {
				counter--;
			} else {
				counter = initialCount;
			}
			counterDisplay.setText(Integer.toString(counter));
			
		}
	}

	
	public static void main(String[] args) {
		CountDownGUI frame = new CountDownGUI();
	
	}
	
}
