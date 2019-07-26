package ourFirstJavaProgram;

import java.util.Scanner;

class Learningjavaform {

	public static void main(String[] args) {

		Scanner Infoapp = new Scanner(System.in);
		
		
		System.out.println("please enter your first name");
		String firstname = Infoapp.nextLine();
		
		System.out.println("please enter your last");
		String lastname = Infoapp.nextLine();
		
		System.out.println("please enter your DOB");
		String DOB = Infoapp.nextLine();
		
		System.out.println("please enter your phone");
		long phonenumber = Infoapp.nextLong();
		
		System.out.println("please enter your height");
	    double height = Infoapp.nextDouble();
	    
	    System.out.println("how old are you");
	    byte howoldareyou = Infoapp.nextByte();
	    
	    System.out.println("have you taken a drug test in past 6 months");
	    boolean drugtest = Infoapp.nextBoolean();
		
		System.out.println(firstname + "" + lastname + "    " + DOB + "    " + phonenumber + "    " + height + "   " + howoldareyou + "    " + drugtest);
		
	
	}

}
