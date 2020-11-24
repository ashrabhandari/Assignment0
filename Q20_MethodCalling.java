package Assignment1;

import java.util.Scanner;

public class Q20_MethodCalling {
	public static void calculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first integer");
		int a = input.nextInt();
		System.out.println("Enter your second integer");
		int b = input.nextInt();
		System.out.println("Enter your operator: + -  * % ");
		char choice = input.next().charAt(0);

		switch (choice) {
		case '+':
			System.out.println("Addition: " + (a + b));
			break;
		case '-':
			System.out.println("Substraction: " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication: " + (a * b));
			break;
		case '%':
			System.out.println("Division: " + (a % b));
			break;
		default:
			System.out.println("Wrong choice of Operator");
			break;

		}
		input.close();
	}

	public static void main(String[] args) {
		Q20_MethodCalling.calculator();

	}

}
