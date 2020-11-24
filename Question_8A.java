package Assignment1;

import java.util.Scanner;

public class Question_8A {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter degree Celsius");
		int a = input.nextInt();
		
		double ConversionOfCelsiusToFahrenheit = a * 1.8 +32 ;
		System.out.println("Celsuis To Fahrenheit:" + ConversionOfCelsiusToFahrenheit);
		
		input.close();
	}

}
