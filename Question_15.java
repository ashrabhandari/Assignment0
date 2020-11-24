package Assignment1;

import java.util.Scanner;

public class Question_15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your number: ");
		int n = input.nextInt();
		
		if (n >= 0 && n <= 128) {
			char c = (char) n ;
			System.out.println("Your ASCII code is " +c);
		} else {
			System.out.println("Wrong number");
		}
		input.close();
		
	}

}
