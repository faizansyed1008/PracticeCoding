package constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//creating two objects using constructor
		    
		Employee empone = new Employee("Faizan Ali Syed");
	
		
		//Invoking methods for each object created
		
		empone.empAge(27);
		empone.empDesignation("Developer");
		empone.empSalary(150000);
		empone.printEmployee();
		
		
		

	}

}
