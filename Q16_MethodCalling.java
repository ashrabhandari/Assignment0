package Assignment1;

import java.util.Scanner;

public class Q16_MethodCalling {
	public static void findOddOrEven() {
		Scanner input = new Scanner (System.in); 
		System.out.println("Enter a number");
		int n = input.nextInt();
		
		if (n % 2 == 0  ) {
			System.out.println(" This number is an even number");
		}else {
				System.out.println("This number is an odd number");
			}
		input.close();
		}
	public static void main(String[] args) {
		Q16_MethodCalling.findOddOrEven();
		
	}

}
