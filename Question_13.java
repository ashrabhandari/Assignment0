package Assignment1;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number in negative");
		int number = input.nextInt();
		
		if (number < 0 ) {
		System.out.println("Your negative number is:" + number );
	
		}
input.close();
}
}