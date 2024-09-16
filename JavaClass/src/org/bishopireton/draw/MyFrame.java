package org.bishopireton.draw;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyFrame() throws HeadlessException {
		this("Graphics");
	}

	public MyFrame(String title) throws HeadlessException {
		super(title);
		setup();
	}

	private void setup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);
		setLocationRelativeTo(null);
		//setLocation(100, 200);		
	}

}
