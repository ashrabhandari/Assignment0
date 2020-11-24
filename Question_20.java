package Assignment1;

import java.util.Scanner;

public class Question_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First Number:");
		int n1 = input.nextInt();
		System.out.println("Enter your Second Number:");
		int n2 = input.nextInt();
		
		System.out.println("Enter your operator: + - * % ");
		char choice = input.next().charAt(0);

		switch (choice) {
		case '+':
			System.out.println("Performing Addition:" + (n1 + n2));
			break;

		case '-':
			System.out.println("Performing Substraction:" + (n1 - n2));
			break;

		case '*':
			System.out.println("Performing Multiplication:" + (n1 * n2));
			break;

		case '%':
			System.out.println(" Performing Division:" + (n1 % n2));
			break;

		default:
			System.out.println(" Wrong choice of Operator");
			break;

		}
		input.close();
	}
}