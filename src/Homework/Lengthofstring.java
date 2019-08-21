package Homework;

public class Lengthofstring {

	public static void main(String[] args) {

		String name = "Faizan";
		int length = name.length();
		
			
		if(name.length()== 5) {
			System.out.println("The String is not Empty and length is : " + name.length());
			
		}else if(name.length()<5) {
			System.out.println("");
			
		}else if ( name.length()>5) {
			System.out.println("The String is Empty and length is : " + name.length());
			
		}
		

	}

}
