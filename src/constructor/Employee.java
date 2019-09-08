package constructor;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	//This is constructor of the class employee
	public Employee(String name) {
		this.name = name;
	
	}
	
	//Assign the age of the employee to the variable
	public void empAge(int age) {
		this.age = age;
	
	}
	//Assigning the designation to variable
	public void empDesignation(String empDesig) {
		designation = empDesig;
	
	}
	//Assigning the salary to variable
	public void empSalary(double empSalary) {
		salary = empSalary;
	
	}
	//Print the employee details
	public void printEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+ age);
		System.out.println("designation: "+ designation);
		System.out.println("salary: "+salary);
		
		
	}
}  

