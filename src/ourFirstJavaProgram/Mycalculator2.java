package ourFirstJavaProgram;

import java.util.Scanner;

public class Mycalculator2 {

	public static void main(String[] args) {
	
		Scanner Mycalculator2 = new Scanner(System.in);
		
		System.out.println("My Calculator");
		
		// You Are Adding 
		
		System.out.println("Please enter your first  Adding number");
		int firstnumber = Mycalculator2.nextInt();
		
		System.out.println("Please enter your second Adding number");
		int secondnumber = Mycalculator2.nextInt();
		
		int Total = firstnumber + secondnumber;
		
		System.out.println("Your Adding total is, "+firstnumber+" + "+secondnumber+" ");
		System.out.println(firstnumber +" + "+secondnumber+" = " +Total);
		
		// You are multiplying
		
		System.out.println("Please enter your first multiplying number");
		
		int thirdnumber = Mycalculator2.nextInt();
		
		System.out.println("Please enter your second multiplying number");
		
		int forthnumber = Mycalculator2.nextInt();
		
		int total = thirdnumber * forthnumber;
		
		System.out.println("Your multiplying total is, "+thirdnumber+" x "+forthnumber+" ");
		System.out.println(thirdnumber +" X "+forthnumber+" = " +total);
		
        // you are Dividing
		
		System.out.println("Please enter your first Dividing number");
		
		double fifthnumber = Mycalculator2.nextDouble();
		
		System.out.println("Please enter your second Dividing number");
		
		double  sixthnumber = Mycalculator2.nextDouble();
		
		double atotal = fifthnumber / sixthnumber;
		
		System.out.println("Your Dividing total is, "+fifthnumber+" / " +sixthnumber+" ");
		System.out.println(fifthnumber +" / "+sixthnumber+ " = " +atotal);
		
		//You Are Deducting
		
		System.out.println("Please enter your first Deduction number");
		
		int seventhnumber = Mycalculator2.nextInt();
		
		System.out.println("Please enter your second Deduction number");
		
		int eigthnumber = Mycalculator2.nextInt();
		
		int totaL = seventhnumber - eigthnumber;
		
		System.out.println("Your Deduction Total is, "+seventhnumber+ " - "+eigthnumber+ " ");
		System.out.println(seventhnumber +" - "+eigthnumber+ " = " +totaL);
		
	    System.out.println("Thanks for using My Calculator");
	    

	}

}
