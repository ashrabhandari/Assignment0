package Assignment1;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the Circle:");
		float r = input.nextInt();

		final double ValueOfPi = 3.14;
		
		final double PI = Math.PI;
		double AreaOfCircle = PI *(r*r);
		System.out.println("Area of Circle is:" +AreaOfCircle);
	
		
		System.out.println("Enter the length of Rectangle:");
		float l = input.nextInt(); 
		
		System.out.println("Enter the width of the Rectangle:");
		float w = input.nextInt();
	
		float AreaOfRectangle = (w*l); 
		System.out.println("Area of Rectangle is:" + AreaOfRectangle );
		
		
		System.out.println("Enter the height of the Triangle:");
		float h = input.nextInt();
		
		System.out.println("Enter the base of the Triangle:");
		float b = input.nextInt();
		
		float AreaOfTriangle = (h*b)/2;
		System.out.println("Area of Triangle is:" +AreaOfTriangle );
		input.close();
		
 }
}