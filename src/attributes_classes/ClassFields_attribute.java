package attributes_classes;

public class ClassFields_attribute {

	// class Attributes or fields
	int x = 4;
	int y = 3;
	int z = 2;

	public static void main(String[] args) {
        ClassFields_attribute object1  = new ClassFields_attribute();
		ClassFields_attribute object2 = new ClassFields_attribute(); // created OBJECT of ClassFields_attribute CLASS
		object2.x = 40; // modifying class attribute
		object2.y = 30; // Override value of class attribute Y.
		object2.z = 20;
		
		System.out.println(object1.x); // printing out the value of x using OBJECT
		
		System.out.println(object1.y);
		
		System.out.println(object1.z);

		System.out.println(object2.x); // printing out the value of x using OBJECT2

		System.out.println(object2.y);

		System.out.println(object2.z);

	} // main method bracket is closing

}// class bracket is closing
