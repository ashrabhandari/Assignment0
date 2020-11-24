package Assignment1;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Principle:");
		double P = input.nextInt();
		
		System.out.println("Enter the Daily Interest Rate:");
		double T = input.nextInt();
		
		System.out.println("Enter the Time Period");
		double R = input.nextInt();
		
		double SimpleInterest = (P*T*R)/ 100 ; 
		System.out.println("Simple Interest is:" +SimpleInterest);
		input.close();

	}

}
