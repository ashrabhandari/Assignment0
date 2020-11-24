package Assignment1;

import java.util.Scanner;

public class Question_8B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter degree Fahrenheit");
		int a = input.nextInt();
		
		double ConversionOfFahrenheitToCelsius = (a - 32) / 1.8 ;
		System.out.println("Fahrenheit to Celsius:" + ConversionOfFahrenheitToCelsius);
		input.close();

	}

}
