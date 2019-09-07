package ourFirstJavaProgram;

import java.util.Scanner;

public class Mycalculator2 {

	public static void main(String[] args) {
	
		Scanner Mycalculator2 = new Scanner(System.in);
		
		System.out.println("<------My Calculator-------->");
		
		// You Are Adding 
		
		System.out.println("Please enter your first  Adding number");
		int firstnumber = Mycalculator2.nextInt();
		
		System.out.println("Please enter your second Adding number");
		int secondnumber = Mycalculator2.nextInt();
		
		int Total = firstnumber + secondnumber;
		
		System.out.println("Your total is: "+firstnumber+" + "+secondnumber+" = " +Total);
		System.out.println("------------------------------------");
		
		// You are multiplying
		
		System.out.println("Please enter your first multiplying number");
		
		int thirdnumber = Mycalculator2.nextInt();
		
		System.out.println("Please enter your second multiplying number");
		
		int forthnumber = Mycalculator2.nextInt();
		
		int total = thirdnumber * forthnumber;
		
		System.out.println("Your multiplying total is: "+thirdnumber+" x "+forthnumber+" = "+total);
		System.out.println("--------------------------------------");
		
        // you are Dividing
		
		System.out.println("Please enter your first Dividing number");
		
		double fifthnumber = Mycalculator2.nextDouble();
		
		System.out.println("Please enter your second Dividing number");
		
		double  sixthnumber = Mycalculator2.nextDouble();
		
		double atotal = fifthnumber / sixthnumber;
		
		System.out.println("Your Dividing total is: "+fifthnumber+" / " +sixthnumber+" = "+atotal);
		System.out.println("-----------------------------------------");
		
		//You Are Deducting
		
		System.out.println("Please enter your first Deduction number");
		
		int seventhnumber = Mycalculator2.nextInt();
		
		System.out.println("Please enter your second Deduction number");
		
		int eigthnumber = Mycalculator2.nextInt();
		
		int totaL = seventhnumber - eigthnumber;
		
		System.out.println("Your Deduction Total is: "+seventhnumber+ " - "+eigthnumber+ " = "+totaL);
		System.out.println("------------------------------------------");
	
		
	    System.out.println("Thank You for using My simple Calculator");
	    

	}

}
