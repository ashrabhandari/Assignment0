package Assignment1;

import java.util.Scanner;

public class Question_10A {

	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		
		System.out.println("Enter the intial velocity [u]");
		int u = input.nextInt();
		
		
		System.out.println("Enter the Acceleration [a]");
		int a = input.nextInt();
		
		System.out.println("Enter The Time [t]");
		int t = input.nextInt();
		
		double displacement = (u * t) + 0.5* (a) * (t*t);
		System.out.println("Displacement(s)"+ displacement );
		input.close();
		
	}
}