package practice;
import javax.swing.JOptionPane;

public class MathPractice {
	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base:"));
		double perpendicular = Double.parseDouble(JOptionPane.showInputDialog("Enter the perpendicular:"));
		double hypotenuse = Math.sqrt(Math.pow(perpendicular, 2) + Math.pow(base, 2));
		JOptionPane.showMessageDialog(null,"Hypotenuse: "+hypotenuse);
	}
}
