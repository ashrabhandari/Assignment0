package Assignment1;

import java.util.Scanner;

public class Question_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n = input.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

		input.close();

	}

}
