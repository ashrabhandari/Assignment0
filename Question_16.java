package Assignment1;

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		
		if (n % 2 == 0 ) {
			System.out.println("The number you entered is an even number ");
		}
		else {
			System.out.println("The number you entered is an odd number ");
		}
		input.close();
	}
}

