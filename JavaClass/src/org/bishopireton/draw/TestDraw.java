package org.bishopireton.draw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestDraw {

	private static MyFrame frame;
	
	
	private static JPanel createFooter() {
		JPanel footer = new JPanel();
		
		JButton button = new JButton("Do Something");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I DID IT");
				
			}
			
		});
		
		footer.add(button);
		return footer;
	}

	private static void createBody() {
		// TODO Auto-generated method stub
		
	}

	private static JPanel createHeader() {
		JPanel header = new JPanel();
		header.setBackground(Color.BLACK);
		JLabel title = new JLabel("HEADER");
		title.setForeground(Color.YELLOW);
		header.add(title);
		return header;
		
	}
	
	
	public static void main(String[] args) {
		frame = new MyFrame("Learning Components");
		
		frame.add(createHeader(), BorderLayout.PAGE_START);
		createBody();
		frame.add(createFooter(), BorderLayout.PAGE_END);
		
		frame.setVisible(true);
		

	}


}
