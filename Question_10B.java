package Assignment1;

import java.util.Scanner;

public class Question_10B {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first side of the triangle [a] ");
		double a = input.nextDouble();
		
		System.out.println("Enter second side of the trianle [b] ");
		double b = input.nextDouble();
		
		System.out.println("Enter third side of the triangle [c]");
		double c = input.nextDouble();
		
		double s = (a+b+c) / 2 ;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area:" + area);
		
		input.close();

	}

}
