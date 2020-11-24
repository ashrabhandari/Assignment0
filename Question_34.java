package Assignment1;

import java.util.Scanner;

public class Question_34 {

	public static void main(String[] args) {
		// Write a program to reverse the element of an array.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		System.out.println(" ");

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number: ");
			arr[i] = input.nextInt();
		}
		System.out.println("Orginial Array Order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}

		System.out.println(" ");
		System.out.println("Reversed Array Order:");
		for (int i = (arr.length - 1); i >= 0; i--) {
			System.out.println(arr[i] + " ");

		}
		input.close();
	}

}
