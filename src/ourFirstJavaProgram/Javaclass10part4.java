package ourFirstJavaProgram;

import java.util.Arrays;

public class Javaclass10part4 {

	public static void main(String[] args) {
		
	//abcdefghijklmnopqrstuvwxyz	
	
		String strs[] = {"a","b","z","h","w","r",};
	
	//1,2,3,6,23,44
		int nums[] = {3,1,44,23,2,6};
		
	Arrays.parallelSort(strs);
	
	for (int i = 0 ; i < strs.length; i++) {
		System.out.print(strs[i]);
	}
	
	System.out.println();
	
	for (int i : nums) {
		System.out.print(i);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//example on how to replace a String
//
//		String[] cars = { "toyota", "honda", "ferrari", "gm", "ford", "lamborgini" };
//        int index = 0;
//	
//        for (String make : cars) {
//        	if (make.equalsIgnoreCase("gm")) {
//        		cars[index] = "General motors";
//        		
//        	}
//        	
//        	index ++;
//        }
//        
//        for (String string : cars) {
//        	System.out.println(string);
//        }
//        
//         for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//
//			if (cars[i].equalsIgnoreCase("gm")) {
//				cars[i] = "General Motors!";
//
//			}
//
//        }

	
	
	
	
	
	
	
	
	
	
	
	
	}

}
