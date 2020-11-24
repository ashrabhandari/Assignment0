package Assignment1;

import java.util.Scanner;

public class Question_36 {

	public static void main(String[] args) {
		// Write a function to find duplicate elements in an array.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = input.nextInt();
		System.out.println(" ");

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Number: ");
			arr[i] = input.nextInt();

		}
		System.out.println("Duplicate Number:");
		int count = -0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j] + " ");
					count++;
				}

			}

		}
		if (count == 0) {
			System.out.println("No duplicate elements:");
		}
		input.close();
	}

}
