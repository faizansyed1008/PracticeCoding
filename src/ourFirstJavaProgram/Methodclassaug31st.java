package ourFirstJavaProgram;

public class Methodclassaug31st {

	public static void main(String[] args) {

		int additionTotal = calculator(33, 33, "addition");

		int subtractionTotal = calculator(43, 33, "subtraction");

		int multiplicationTotal = calculator(3, 3, "multiplication");

		int divisionTotal = calculator(3, 3, "division");

		if (additionTotal == 66) {
			System.out.println("you are correct");
		} else {
			System.out.println("There is something wrong in your calculator method");
		}

	}

	public static int calculator(int num1, int num2, String opretional) {
		return 0;

	}
}
