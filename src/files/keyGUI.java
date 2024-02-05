package files;


import javax.swing.*;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class keyGUI {
	
	JFrame screen = new JFrame();

	public keyGUI() {
		
		this.configGUI();
		screen.setVisible(true);
		
	}
	
	public void configGUI() {
		
		JPanel panel = new JPanel(new GridLayout(3,5,5,5));
		JTextArea textArea = new JTextArea(10, 20);
		JScrollPane scrollPane = new JScrollPane(textArea);
		textArea.setEditable(false);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
	
		
		screen.setTitle("GUI");
		screen.setSize(1000, 500);
		
		TestTableSortFilter table = new TestTableSortFilter();
		
		panel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Hello");
		panel.add(table);
		screen.add(panel, BorderLayout.WEST);
		
		
		
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
