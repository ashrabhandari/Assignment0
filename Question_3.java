package Assignment1;

import java.util.Scanner;

public class Question_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first number:");
		int a = input.nextInt();
		
		System.out.println("Enter second number");
		int b = input.nextInt();
		
		int Sum =  a+ b;
		int Avg = (a+b)/2;
		
		System.out.println(" Sum of the number: " +a+ " and " +b+ " is: " +Sum );
		System.out.println(" Average of the number: " +a+ " and " +b+ " is: " +Avg );
		
		input.close();
		
	}

}
