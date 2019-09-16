package classSuper;

public class CarTest {

	public static void main(String[] args) {
		Car small = new Car();
		small.display();

		Students Student = new Students();
		Student.display();
		Student.message();

		Students student2 = new Students("Faizan", 27);
		student2.display();
	}
}
