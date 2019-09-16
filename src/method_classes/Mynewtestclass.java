package method_classes;

public class Mynewtestclass {

	static int myMethod(int x) {
		return 5 + x;
	}

	public static void main(String[] args) {

		myMethod();
		myMethod("faizan");
		System.out.println(myMethod(5));
	}

	static void myMethod() {
		System.out.println("hello faizan");

	}

	static void myMethod(String fname) {
		System.out.println(fname + " ali");
	}

	
}
