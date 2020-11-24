package Assignment1;

import javax.swing.JOptionPane;

public class Question_7 {
	public static void main(String[] args) {
		
		final double PI = Math.PI;
		String a = JOptionPane.showInputDialog("Enter the radius of the cylinder:");
		double radius = Double.parseDouble(a);
		
		String b = JOptionPane.showInputDialog("Enter the height of the cylinder:");
		double height = Double.parseDouble(b);
		
		double VolumeOfCylinder = PI * (radius * radius) * height ;
		JOptionPane.showMessageDialog(null,"Volume of the cylinder is:" +VolumeOfCylinder );
	}

}
