package Assignment1;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter weight in pounds");
		int a = input.nextInt();
		
		double convertPoundsToKg = a * 0.45359237 ;
		System.out.println("Pounds to Kg " + convertPoundsToKg);
		input.close();

	}

}
