package polymorphsim;

public class MyMainClass {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();  // Create a Animal object
		Animal myPig = new Pig();        // Create a Pig object
		Animal myDog = new Dog();        // Create a dog object
		
		
		
		
		
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		

	}

}
