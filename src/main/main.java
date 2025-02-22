package main;

import javax.swing.JFrame;

public class main {
	public static void main(String[]args) {
		
		JFrame window = new JFrame("Simple Chess");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(window);
		
		//Add GamePanel to the window
		GamePanel gp = new GamePanel();
		window.add(gp);
		//Window adjust size to gamePanel
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
