package Homework;

public class Homework2 {

	public static void main(String[] args) {

		int Sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;

		
		  for (int number = lowerbound; number <= upperbound; ++number) {
		  
		  Sum += number;
		  
		 
		  }
		 
		 System.out.println("sum of 1 to 100 = " + Sum);
		 
		 average = Sum/upperbound;
		 
		 System.out.println("Average " + average);
		
		
	}

}
