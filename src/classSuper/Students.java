package classSuper;

public class Students extends Person {

	String name;
	int age;

	void message() {
		System.out.println("This is from student class");
		System.out.println("---------------");
	}

	// Note that display() is only in Student class
	void display() {
		// will invoke or call current class message() method
		message();

		// will invoke or call parent class message() method
		super.message();
	}

	Students() {
		super();
		System.out.println("Printing from student class constructor");
		System.out.println("---------------------");
	}

	Students(String name, int age) {
		super("faizan!!!!!!!!!");
		System.out.println("-----");
		this.name = name;
		this.age = age;

		System.out.println("Student name is " + name + " age is " + age);
		System.out.println("-----------");
	}

}
