package Assignment1;

import java.util.Scanner;

public class Question_23 {
	// Write a Program to sum 1 to nth natural numbers.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		System.out.println("Sum of the number:" + sum);
		input.close();
	}
}