package polymorphsim;

public class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int CLD, String carname) {
		this.cylinders = CLD;
		this.name = carname;
		this.wheels = 4;
		this.engine = true;

	}

	public int getcylinders() {
		return cylinders;
	}

	public String getname() {
		return name;

	}

	public String startengine() {
		return "Car -> engine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";

	}
	public String brake() {
		return "Car -> brake()";
	}
}
