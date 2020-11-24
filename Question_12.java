package Assignment1;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your roll number");
		int rollno = input.nextInt();
		
		System.out.println("Enter your name");
		String name = input.next();
		
		System.out.println("Enter your nationality");
		String nationality = input.next();
		
		System.out.println();
		
		System.out.println("Roll Number:"+ rollno);
		System.out.println();
		System.out.println("Name:" + name);
		System.out.println();
		System.out.println("Nationality:" + nationality);
		input.close();

	}

}
