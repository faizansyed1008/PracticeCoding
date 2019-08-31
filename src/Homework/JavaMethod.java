package Homework;

public class JavaMethod {

	public static boolean isEven(int number1, int number2) {
		int x1 = number1 %2 ;
		int x2 = number2 %2;
		if (x1 == 1 && x2 == 5) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isEven(1,1));

	}

}
