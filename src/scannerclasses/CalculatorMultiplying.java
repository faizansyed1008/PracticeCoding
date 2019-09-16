package scannerclasses;

import java.util.Scanner;

public class CalculatorMultiplying {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This is the best calculator");
		System.out.println("please enter your integer value");
		
		int avalue = scanner.nextInt();
		
		
		System.out.println("Please enter your second integer value");
		
		
		int bvalue = scanner.nextInt();
		
		
		int atotal = avalue * bvalue;
		
		System.out.println("you are multiplication, "+avalue+" to  "+bvalue+" ");
		
		System.out.println(avalue +" x "+bvalue +" = "+atotal );

	}

}
