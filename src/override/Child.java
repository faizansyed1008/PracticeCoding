package override;

public class Child extends Parent {
	// This method override show() of Parent
	@Override
	void show()
	{
		System.out.println("Child's show()");
	}

	// new m1() method
	// unique to Child class
	private void m1()
	{
		System.out.println("From child m1()");
	}
	
	// override method
	// with more accessibility 
	@Override
	public void m2()
	{
		System.out.println("From child m2()");
	}
}
