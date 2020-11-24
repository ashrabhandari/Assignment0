package Assignment1;

import java.util.Scanner;

public class Question_35 {

	public static void main(String[] args) {
		// Write a function to find the second largest number in a given array.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		System.out.println(" ");

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number: ");
			arr[i] = input.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(" ");

		}
		System.out.println("Second largest number in the list is: " + arr[size - 2]);
		input.close();
	}

}
