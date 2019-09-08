package method_classes;

public class Method {

	public static void main(String[] args) {
		
		maxfunction(3, 5);
		maxfunction(5,100);
		maxfunction(6,200);
		
		
		
		
		// min = (n1 > n2) ? n2 : n1;
		// boolean true:false

		// System.out.println(min);

//public static int minFunction(int n1, int n2) {

//
//		int min;
//
//		
//			if (n1 > n2)
//				min = n2;
//			else
//				min = n1;
//
//			return min;

	}

	public static void maxfunction(int n1, int n2) {

		
		int max;

		if (n1 < n2)
			max = n2;
		else
			max = n1;
		
	System.out.println(max);
	

	}

}
