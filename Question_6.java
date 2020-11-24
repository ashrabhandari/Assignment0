package Assignment1; 

import javax.swing.JOptionPane;

public class Question_6 {

	public static void main(String[] args) {
		//Use JoptionPane
		final double PI = Math.PI;
		String a = JOptionPane.showInputDialog("Enter the radius of the circle:");
		double radius = Double.parseDouble(a);
		
		double perimeterOfCircle = 2 * PI * radius ;
		JOptionPane.showMessageDialog(null, "Perimeter of circle is:" +perimeterOfCircle);
		
		String b = JOptionPane.showInputDialog("Enter the length of the rectangle:");
		double length = Double.parseDouble(b);
		String c = JOptionPane.showInputDialog("Enter the breadth of the rectangle:");
		double breadth = Double.parseDouble(c);
		
		double perimeterOfRectangle = 2 *(length+ breadth);
		JOptionPane.showMessageDialog(null, "Perimeter of rectangle is:" + perimeterOfRectangle);
		

		String d = JOptionPane.showInputDialog("Enter the  first side of the triangle:");
		double side1 = Double.parseDouble(d);
		String e = JOptionPane.showInputDialog("Enter the base of the triangle:");
		double base = Double.parseDouble(e);
		String f = JOptionPane.showInputDialog("Enter the second side of the triangle:");
		double side2= Double.parseDouble(f);
		
		double perimeterOfTriangle= (side1 + base + side2);
		JOptionPane.showInternalMessageDialog(null,"Perimeter of triangle is:"+ perimeterOfTriangle);
	}

}
