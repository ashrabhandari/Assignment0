package Assignment1;

import java.util.Scanner;

public class Question_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		int factorial = 1;

		for (int i = n; i >= 2; i--) {
			factorial = factorial * i;

		}
		System.out.println("Factorial of:" + factorial);
		input.close();
	}

}
