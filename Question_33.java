
package Assignment1;
import java.util.Scanner;

public class Question_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create object of scanner class
		System.out.println("Enter size of an array:");
		int size = input.nextInt();
		System.out.println(" ");
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Elements: ");
			arr[i] = input.nextInt();

		}
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		System.out.println(" ");
		System.out.println("Sorted list in Ascending order: ");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.print(arr[arr.length - 1]);
		input.close();

	}

}