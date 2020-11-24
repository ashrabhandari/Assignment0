package Assignment1;

import java.util.Scanner;

public class Question_27 {
	// Write a Program to sum each digit of given number as well as product.
	// 456 =>4*5*6 and 4+5+6

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int originalNumber = input.nextInt();
		int sum = 0;
		int mul = 1;

		System.out.println("Original Number is:" + originalNumber);
		while (originalNumber != 0) {
			int temp = originalNumber % 10;
			sum = sum + temp;
			mul = mul * temp;
			originalNumber = originalNumber / 10;

		}
		System.out.println("Sum of the digit is:" + sum);
		System.out.println("Multiplication of the digit is:" + mul);
		input.close();
	}

}
