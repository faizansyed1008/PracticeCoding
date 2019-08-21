package Homework;

import java.util.Arrays;

public class NumericArrayandstringArray {

	public static void main(String[] args) {
	int[] my_array1 = { 1789,2035,1899,1456,20131458,1254,1472,2365,1456,2165,1457,2456};
		
		String[] my_array2 = {"Java","JDBC","SQL","Junit","Selenium","Jenkins","Cucumber","Agile","SDLC","WebDriver"};
		
		Arrays.parallelSort(my_array1);
		Arrays.parallelSort(my_array2);
		
		for (int i=0; i < my_array1.length; i++) {
			System.out.println("\n" + my_array1[i]);
			
		}
		System.out.println("----------------------");
		
		for (String i: my_array2) {
			System.out.println("\n" + i);
		}
		

	}

}
