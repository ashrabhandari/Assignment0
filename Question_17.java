package Assignment1;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		System.out.println("Enter your year to check if it's a leap year");
		int a = input.nextInt();
		
		  if ( a % 4 == 0 ) {
				  System.out.println("It is a not a leap year");
			  
			  }
		  else {
			  System.out.println("It is a leap year");
		  }
		  input.close();
	}

}
