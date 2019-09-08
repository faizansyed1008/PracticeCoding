package constructor;

public class Puppy {
	int puppyAge;

	public Puppy(String name) {
		System.out.println("puppy name is  :" + name);

	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		// Object creation
		Puppy myPuppy = new Puppy("tommy");

		// call class method to set puppy's age
		myPuppy.setAge(2);

		// call another class method to get puppy's age
		myPuppy.getAge();

		// you can access instance variable as follows as well
		System.out.println("variable value :" + myPuppy.puppyAge);

	}
}
