import java.util.Scanner;
import javax.swing.JOptionPane;

public class Question3 {
	public static void main(String[] args) {
		int age = Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age?"));
		JOptionPane.showMessageDialog(null,"My age is " + age);
		JOptionPane.showMessageDialog(null,"Twice my age is " + (age*2));
		JOptionPane.showMessageDialog(null,"Three times my age is " + (age*3));
		JOptionPane.showMessageDialog(null,"Half of my age is "+ (age/2.0));
	}
}
