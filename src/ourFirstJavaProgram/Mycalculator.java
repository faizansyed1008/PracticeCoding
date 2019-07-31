package ourFirstJavaProgram;

import java.util.Scanner;

public class Mycalculator {

	public static void main(String[] args) {
		
	Scanner Mycalculator = new Scanner(System.in);
	
	 //you are Adding
	
	 System.out.println("My Calculator");
	 
	 System.out.println("Please enter your First number");
	        int firstnumber = Mycalculator.nextInt();
	
	     
	 System.out.println("Please enter your Second number");
	        int secondnumber = Mycalculator.nextInt();
	        
	        int Total = firstnumber + secondnumber;
	        
	 System.out.println("You are adding, "+firstnumber+" To "+secondnumber+" ");
	 System.out.println(firstnumber +" + "+secondnumber +" = "+Total );

	 
	 
	}

}
