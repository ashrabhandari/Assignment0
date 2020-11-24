package Assignment1;

import java.util.Scanner;

public class Question_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find table of:");
		int n = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			int t = n * i;
			System.out.println(n + " * " + i + " = " + t);

			input.close();
		}

	}
}