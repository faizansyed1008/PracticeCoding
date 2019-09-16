package classSuper;

public class Person {
	void message() {
		System.out.println("this is from person class");
		System.out.println("------------");
	}

	Person() {
		System.out.println("Printing from Person class default construtor");
		System.out.println("----------------");
	}

	Person(String name) {

		System.out.println("Printing the name : " + name);
	}
}
