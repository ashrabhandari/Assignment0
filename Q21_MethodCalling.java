package Assignment1;

import java.util.Scanner;

public class Q21_MethodCalling {
	public static void translatingNameOfTheDay() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int choice = input.nextInt();
		
		
		switch (choice) {
		case 1 : 
			System.out.println("First day:Monday");
			break;
		case 2 :
			System.out.println("Second day:Tuesday");
			break;
		case 3 :
			System.out.println("Third day: Wednesday");
			break;
		case 4 :
			System.out.println("Fourth day: Thursday");
			break;
		case 5 :
			System.out.println("Fifth day: Friday");
			break;
		case 6 :
			System.out.println("Sixth day: Saturday");
			break;
		case 7 :
			System.out.println("Seventh day: Sunday");
		default :
			System.out.println("There are only 7 days in a week!, INVALID INPUT");
		break;
		
		}	
		input.close();
	}

	public static void main(String[] args) {
		
		Q21_MethodCalling.translatingNameOfTheDay();
	}
}
