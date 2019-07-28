package ourFirstJavaProgram;

import java.util.Scanner;

public class Javaclass4 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This is the best calculator");
		System.out.println("please enter your integer value");
		
		int avalue = scanner.nextInt();
		
		
		System.out.println("Please enter your second integer value");
		
		
		double bvalue = scanner.nextInt();
		
		
		double atotal = avalue / bvalue;
		
		System.out.println("you are dividing, "+avalue+" to  "+bvalue+" ");
		
		System.out.println(avalue +" / "+bvalue +" = "+atotal );
		
		
		
		
	   } 
	
	
}

	


 