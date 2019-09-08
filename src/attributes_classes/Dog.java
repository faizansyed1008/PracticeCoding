package attributes_classes;

public class Dog {

	String breed;
	int age;
	String color;
	public static int age1 = 1;

	static void barking() {

		int age = 3;
		System.out.println(age1);
		System.out.println(age);
	}

	void hungry() {

	}

	void sleeping() {

	}

	public static void main(String[] args) {// main method
		barking();
		Dog myDog1 = new Dog();
		myDog1.hungry();
	}

}
