package ourFirstJavaProgram;

public class Javaclass9part1 {

	public static void main(String[] args) {
		//upper case (lower case) equal case
		
		String name = "Faizan Ali Syed";
	
		

		String upperCasename = name.toUpperCase();
		String lowercasename = name.toLowerCase();

		System.out.println(name);
		System.out.println(upperCasename);
		System.out.println(lowercasename);

		int length = name.length();
		System.out.println(length);
		System.out.println(upperCasename.length());
		System.out.println(lowercasename.length());

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(length - 1));
		System.out.println(name.toUpperCase());
		System.out.println(upperCasename);
		System.out.println(name.toUpperCase() == upperCasename);
		System.out.println("this is from line 26 " + name.equals(lowercasename));
		System.out.println("this is from line 27 " + name.equalsIgnoreCase(lowercasename));
		int faizanalisyed = (name.length() - 1) / 2;
		System.out.println("name middle char " + name.charAt(faizanalisyed));

	}

}
