package override;

public class Company {
   public void address() {
	   System.out.println("This is Printing from company class");
   }
   
   void methodDefault() {
	   System.out.println("This is default method");
   }
   
   private void methodPrivate() {
	   System.out.println("This is from Private method");
   }
   
   protected void methodProtected() {
	   System.out.println("This is from protected method");
   }
   
  
}
