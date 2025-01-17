package jFrame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyFrame(){
		
		this.setTitle("Hello Ritik"); // sets the tile of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setSize(420,420); // set the size of the this
		this.setResizable(false);// prevent this from being resize
		this.setVisible(true); // make the this visible on the screen
		
		ImageIcon image =  new ImageIcon("logo.png"); // creates an image icon
		this.setIconImage(image.getImage()); // set icon of the this
		this.getContentPane().setBackground(new Color(0,255,0)); //change background color of the this
	}
}
