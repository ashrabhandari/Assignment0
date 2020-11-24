package Assignment1;

import java.util.Scanner;

public class Question_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  first side of the triangle:"); 
		int a = input.nextInt();
		
		System.out.println("Enter the second side of the triangle:");
		int b = input.nextInt();
		
		System.out.println("Enter the third side of the triangle:");
		int c = input.nextInt();
		
		System.out.println(" ");
		if ( (a+b < c) || (a+c < b) || (c+b < a)) {
			System.out.println(" Invalid Triangle");
		
	    } else if ( a == b && b == c) {
			System.out.println("It is an Equilateral Triangle");
	    } else if (a == b || a == c || b == c) {
	    	System.out.println("It is an Isosceles Triangle");
	    } 
	    else 
	    {System.out.println("It is a Scalene Triangle");
	}
input.close();
}
}