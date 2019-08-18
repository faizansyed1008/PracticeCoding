package ourFirstJavaProgram;

public class Javaclass10part1 {

	public static void main(String[] args) {

		// this is int array
		int[] aray = { 10, 20, 30, 40, 50 };
		System.out.println("this is first element of Array " + aray[0]);
		// this is string array
		String[] cars = { "Volvo", "Bmw", "Benz", "Acura", "Lexus", };

		System.out.println("This is the first Element of Array " + cars[0]);

		char status[] = new char[20];

		String name = "faizan";
		char firstChar = name.charAt(0);

		System.out.println(firstChar);

		for (int i = 0; i < name.length(); i++) {
			char singlechar = name.charAt(i);
			status[i] = singlechar;
		}
		System.out.println(status);

		// array has to be on the same line
		int[] ages = { 19, 39, 93, 33, 46 };

	}

}
