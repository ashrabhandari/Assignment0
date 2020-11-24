package Assignment1;

import java.util.Scanner;

public class Q19_MethodCalling {
	public static void findTypeOfTriangle() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first side of the triangle");
		int a = input.nextInt();
		System.out.println("Enter the second side of the triangle");
		int b = input.nextInt();
		System.out.println("Enter the third side of the triangle");
		int c = input.nextInt();

		if ((a + b) < c || (a + c) < b || (b + c) < a) {
			System.out.println("It is an invalid triangle!");
		}
		if (a == b && b == c) {
			System.out.println("Your triangle is an Equilateral Triangle");
		} else if (a == b || b == c || c == a) {
			System.out.println("Your triangle is an Isosceles Triangle ");
		} else {
			System.out.println("It is a Scalene Triangle");
		}

		input.close();
	}

	public static void main(String[] args) {
		Q19_MethodCalling.findTypeOfTriangle();
	}

}
