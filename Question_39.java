package Assignment1;

//Write a Program to display name in short form. E.g. Ram Kishore Singh  -> R. k. Singh

import java.util.Scanner;

public class Question_39 {

	static void printInitials(String str) {
		if (str.length() == 0) {
			return;

		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String str = input.next();
		String[] arr = str.split(" ");
		printInitials(str);

	}

}
