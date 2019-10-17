package javaRecap;

public class MethodOverloading {

	
	
	//Area calculator of square = a * a;
	
	public int getArea(int a) {
		return a*a;
		
}

  //getArea with return type double
	
	public double getArea(double a) {
		return a*a;
	}
	
   public long getArea(long a) {
	   return a*a;
   }
   





public int getArea(int length, int width) {
	return length*width;
}

public double getArea(double a, int b) {
	return a * b;
}


}




