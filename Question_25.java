package Assignment1;

import java.util.Scanner;

public class Question_25 {
	//Write a program that prompts the user to enter the number of students and each student’s name and score.
	//Finally display the student with the highest score.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int numOfStudent = input.nextInt();

		int maxScore = 0;
		String studentName = " ";

		for (int i = 1; i <= numOfStudent; i++) {
			System.out.println("Enter name of the student: ");
			String name = input.next();
			System.out.println("Enter score of the student: ");
			int score = input.nextInt();

			if (score > maxScore) {
				maxScore = score;
				studentName = name;

			}

		}
		System.out.println();
		System.out.println("Student's name with highest score is:" + studentName);
		System.out.println("Max score is:" + maxScore);
		input.close();
	}

}
