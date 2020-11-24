package Assignment1;

import java.util.Scanner;

public class Question_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter your first nummber: n1");
		int n1 = input.nextInt();
		
		System.out.println(" Enter your second nummber: n2");
		int n2 = input.nextInt();
		
		System.out.println(" Enter your third nummber: n3");
		int n3 = input.nextInt();
		
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("First Number: " +n1+ " is larger");
		}
		
		else if (n2>n3) {
			System.out.println("Second Number: " +n2+ " is larger");
		}
		else if (n3>n1 && n3>n2) {
			System.out.println("Third number: " +n3+  " is larger");
		}
		input.close();
	}
}