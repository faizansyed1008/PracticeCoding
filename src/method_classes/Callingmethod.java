package method_classes;

public class Callingmethod {

	public static void main(String[] args) {

		mynumbers();
		mynumbers(10, 10);
		mynumbers(20.1f, 20.2f);
		mynumbers(1000000000, 10000000);
	}

	public static void mynumbers() {

		int numA = 30;
		int numB = 20;

		int total = numA + numB;

		System.out.println(total);

	}

	public static void mynumbers(int numA, int numB) {

		int total = numA * numB;

		System.out.println(total);
	}

	public static float mynumbers(float numA, float numB) {

		float total = numA * numB;

		System.out.println(total);

		return total;
	}

	public static long mynumbers(long numA, long numB) {

		long total = numA + numB;
		System.out.println(total);

		return total;
	}

}
