package ourFirstJavaProgram;

public class Javaclass6 {

	public static void main(String[] args) {
		
		int intValueA = 10; 
		int intValueB = 20;
		int intValueC = 25;
		int intValueD = 25;

		System.out.println("a + b = " + (intValueA + intValueB) );
		System.out.println("a - b = " + (intValueA - intValueB) );
		System.out.println("a * b = " + (intValueA * intValueB) );
		System.out.println("b / a = " + (intValueB / intValueA) );
		System.out.println("b % a = " + (intValueB % intValueA) );
		System.out.println("c % a = " + (intValueC % intValueA) );
		System.out.println("a++   = " + (intValueA++) );
		System.out.println("a--   = " + (intValueB--) );
	    
		// Check the difference in d++ and ++d
		System.out.println("d++   = " + (intValueD++) );
		System.out.println("++d   = " + (++intValueD) );
		
	
	
	
	}
	

}
