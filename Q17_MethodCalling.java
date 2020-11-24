package Assignment1;

import java.util.Scanner;

public class Q17_MethodCalling {
	public static void findLeapYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your year to find if it's a leap year");
		int a = input.nextInt();

		if (a % 4 == 0) {
			System.out.println("Your year is a leap year");
		} else {
			System.out.println("Your year is not a leap year");
			input.close();
		}
	}

	public static void main(String[] args) {
		Q17_MethodCalling.findLeapYear();
	}

}
