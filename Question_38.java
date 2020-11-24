package Assignment1;

import java.util.Scanner;

public class Question_38 {
	// Write a program to check whether a given string is palindrome or not.

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;

		}
		return true;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your word to check palindrome:");
		String str = input.next();

		if (isPalindrome(str))
			System.out.println("Yes! The word you entered is palindrome!");
		else
			System.out.println("No! The word you entered is not a palindrome!");
		input.close();
	}

}
