package Assignment1;

import java.util.Scanner;

public class Question_14 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter your first number");
		int integer1 = input.nextInt();
		System.out.println("Enter your second number");
		int integer2 = input.nextInt();
		
		if (integer1 == integer2) {
			System.out.println("Number1 = Number2");
			
		}
		
		if (integer1 < integer2) {
			System.out.println("Number1 < Number2");
			
		}
		
		if (integer1 > integer2) {
			System.out.println("Number1 > Number2");
		}
		input.close();
		
	}

}
