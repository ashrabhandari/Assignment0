package Assignment1;

import java.util.Scanner;

public class Question_26 {
	//Write a Program to reverse the given number. [123 => 321]

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an original Number");
		int originalNumber = input.nextInt();
		int reversedNumber = 0;

		System.out.println("Original number is: " + originalNumber);
		while (originalNumber != 0) {
			int temp = originalNumber % 10;
			reversedNumber = reversedNumber * 10 + temp;
			originalNumber = originalNumber / 10;
		}

		System.out.println("Reversed number is: " + reversedNumber);
		input.close();
	}

}
