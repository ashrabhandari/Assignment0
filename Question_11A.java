package Assignment1;

import java.util.Scanner;

public class Question_11A {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = input.nextInt();
	System.out.println("Enter second number");
	int b = input.nextInt();
	
	System.out.println("Before swapping a is:" + a);
	System.out.println("Before swapping b is:" + b);
	 
	int temp = a;
	a = b;
	b = temp;
	System.out.println("");
	
	System.out.println("After swapping a is:" +a);
	System.out.println("After swapping b is:"+b);

	
	input.close();
	
}
}
