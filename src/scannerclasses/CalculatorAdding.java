package scannerclasses;

import java.util.Scanner;

public class CalculatorAdding {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This is the best calculator");
		System.out.println("please enter your integer value");
		
		int avalue = scanner.nextInt();
	    System.out.println("Please enter your second integer value");
		
		
		int bvalue = scanner.nextInt();
		
		
		int atotal = avalue + bvalue;
		
		System.out.println("you are adding, "+avalue+" to  "+bvalue+" ");
		
		System.out.println(avalue +" + "+bvalue +" = "+atotal );

	}

}
