package constructor;

public class Car {
	int modelYear;
	String modelName;
	
	public Car(int year, String name) {
		modelYear = year;
		modelName = name;	
	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car(1969,  "Ford Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
	

}
