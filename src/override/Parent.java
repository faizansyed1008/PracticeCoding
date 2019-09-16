package override;

public class Parent {
    void show() {
    	System.out.println("Parent's show");
    }
    
    
    //private methods are not overriding
    private void m1()
    {
    	System.out.println("From parent m1()");
    }
    
    protected void m2()
    {
    	System.out.println("From parent m2()");
    }
}

