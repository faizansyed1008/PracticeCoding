package ourFirstJavaProgram;

import java.util.Scanner;

public class Newclass {

	public static void main(String[] args) {
		Scanner Formsapp = new Scanner(System.in);
		System.out.println("Forms App");
		
	
	//	System.out.println("Please Enter Your First Name");
	//  String FirstName = Formsapp.nextLine();
		
		
		System.out.println("Please Enter Your Last Name");
		String pleaseEnterYourLastName = Formsapp.nextLine();
		
		
		System.out.println("Date Of Birth");
		String DateOfBirth = Formsapp.nextLine();
		
		
		System.out.println("Please Enter your Address ");
		String pleaseenteryouraddress = Formsapp.nextLine();
		
		
		System.out.println("Please Enter Your Phone Number");
		long phonenumber = Formsapp.nextLong();
		
		
		System.out.println("Please Enter Your height");
		double pleaseenteryourheight = Formsapp.nextDouble();
		
		
		System.out.println("are you on drugs: (True or False");
		boolean areyouondrugs = Formsapp.hasNextBoolean();
		
		
		System.out.println("have you ever been envoled in any stupid stuff");
		String stupidstuff = Formsapp.nextLine();
		
		System.out.println("my next car will be" + "tesla" + "model s");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
