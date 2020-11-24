package Assignment1;

import java.util.Scanner;

public class Q18_MethodCalling {
	public static void findLargestNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number");
		int n1 = input.nextInt();
		System.out.println("Enter your second number");
		int n2 = input.nextInt();
		System.out.println("Enter your third number");
		int n3 = input.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("Your first number: " + n1 + " is the largest number");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("Your second number: " + n2 + " is the second number");

		} else if (n3 > n1 && n3 > n2) {
			System.out.println(" Your third number: " + n3 + " is the largest number");

		}
		input.close();

	}

	public static void main(String[] args) {
		Q18_MethodCalling.findLargestNumber();

	}

}
