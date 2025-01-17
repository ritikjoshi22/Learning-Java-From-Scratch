package gridBagLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		GridBagLayout layout = new GridBagLayout();
		frame.setLayout(layout);
		GridBagConstraints cons = new GridBagConstraints();
		
		Button btn1 = new Button("1");
		cons.gridx = 0; cons.gridy = 0;
		frame.add(btn1,cons);
		
		Button btn2 = new Button("2");
		cons.gridx = 1; cons.gridy = 0;
		frame.add(btn2,cons);
		
		Button btn3 = new Button("3");
		cons.gridx = 0; cons.gridy = 1;
		frame.add(btn3,cons);
		
		Button btn4 = new Button("4");
		cons.gridx = 1; cons.gridy = 1;
		frame.add(btn4,cons);
		
		Button btn6 = new Button("6");
		cons.gridx = 0; cons.gridy = 2;
		cons.gridwidth=2;cons.fill = GridBagConstraints.HORIZONTAL;
		frame.add(btn6,cons);
		
		Button btn5 = new Button("5");
		cons.gridx = 2; cons.gridy = 0;
		cons.gridheight=3;cons.fill = GridBagConstraints.VERTICAL;
		frame.add(btn5,cons);
		
		frame.setVisible(true);
	}
	
}
