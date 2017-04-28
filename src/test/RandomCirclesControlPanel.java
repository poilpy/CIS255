import java.awt.event.*;
import javax.swing.*;

public class RandomCirclesControlPanel extends JPanel {

	private JButton redrawButton;
	private JCheckBox fillBox;
	
	private JRadioButton blackWhiteButton, randomColorButton;
	
	private RandomCircles drawingPanel;
	
	public RandomCirclesControlPanel(RandomCircles drawingPanel) {
		this.drawingPanel = drawingPanel;
		
		redrawButton = new JButton("Redraw");
		this.add(redrawButton);
		redrawButton.addActionListener(new DrawListener());
		
		fillBox = new JCheckBox("Filled?");
		this.add(fillBox);
		fillBox.addActionListener(new DrawListener());
		
		blackWhiteButton = new JRadioButton("B&W");
		this.add(blackWhiteButton);
		blackWhiteButton.addActionListener(new DrawListener());
		
		randomColorButton = new JRadioButton("Color", true);
		this.add(randomColorButton);
		randomColorButton.addActionListener(new DrawListener());
		
		ButtonGroup group = new ButtonGroup();
		group.add(blackWhiteButton);
		group.add(randomColorButton);
	}
	
	private class DrawListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {			
			if(fillBox.isSelected()) {
				drawingPanel.setFilled(true);
			} else {
				drawingPanel.setFilled(false);
			}
			
			if(blackWhiteButton.isSelected()) {
				drawingPanel.setDrawInColor(false);
			} else if(randomColorButton.isSelected()) {
				drawingPanel.setDrawInColor(true);
			}
			
			drawingPanel.repaint();
		}
	}
	
}
