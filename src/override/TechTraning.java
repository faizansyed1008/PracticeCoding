package override;

public class TechTraning extends Company{

	@Override 
	public void address() {
		System.out.println("This is Printing from sub class named TechTraning");
		}
	
	
	@Override
	void methodDefault() {
		System.out.println("This is Default method");
	}
}

