package Assignment1;

import java.util.Scanner;

public class Question_10C {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a");
		double a  = input.nextDouble();
		
		System.out.println("Enter b");
		double b = input.nextDouble();
		
		System.out.println("Enter c");
		double c = input.nextDouble();
		
		double x =( (-b + Math.sqrt(b*b - 4 *a *c) )/ 2 *a) ;
		
		System.out.println("Area" +x);
		input.close();

	}

}
