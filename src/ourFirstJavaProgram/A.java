package ourFirstJavaProgram;

public class A {
	private int data = 40;

	int defaultIntA = 400;

	void defaultMsg() {
		System.out.println("Hello from class A default msg method");
	}

	private String strProtected = "hello";

	private String protectedMethodFromClassA() {

		return "hello Techcircle";
	}

	private void msg() {
		System.out.println("Hello from class A");
	}

	public static void main(String[] args) {
		A classA = new A();

		// Private
		// System.out.println(classA.data);

		// classA.msg();

//    //default
//    	System.out.println(classA.defaultIntA);
//        
//    	classA.defaultMsg();
//    

		///// Protected
		String a = classA.strProtected;
		System.out.println(a);

		String str = classA.protectedMethodFromClassA();

		System.out.println(str);
	}

}