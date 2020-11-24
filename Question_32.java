package Assignment1;

import java.util.Scanner;  

public class Question_32 {
	//Write a Program to accept 5 values in an array and display their sum.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = input.nextInt();

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number:");
			array[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum = sum + array[i];
			input.close();
		}
		System.out.println("Sum: " + sum);

	}

}