package files;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class keyGUI {
	
	JFrame screen = new JFrame();

	public keyGUI() {
		
		this.configGUI();
		screen.setVisible(true);
		
	}
	
	public void configGUI() {
	
		JPanel panel = new JPanel();
		
		screen.setTitle("GUI");
		screen.setSize(1000, 500);
		
		panel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		this.buttonGUI();
		JButton button = new JButton("Button");
		panel.add(button);
		screen.add(panel, BorderLayout.WEST);
		
		
		
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void buttonGUI() {
		
		
	}
	
}
