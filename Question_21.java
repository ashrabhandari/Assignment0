package Assignment1;

import java.util.Scanner;

public class Question_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number of the week");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println( "Day of the week is Sunday");
			break;
		case 2 :
			System.out.println(" Day of the week is Monday");
			break;
		case 3 :
			System.out.println(" Day of the week is Tuesday");
			break;
		case 4: 
			System.out.println( "Day of the week is Wednesday");
			break;
		case 5 :
			System.out.println( "Day of the week is Thursday");
			break;
		case 6 :
			System.out.println(" Day of the week is Friday");
			break;
		case 7 :
			System.out.println("Day of the week is Saturday");
			break;
			default:
				System.out.println("You entered wrong number");
				break;
			
		}
		input.close();
	}
}
