package Homework;

public class SecondLargestElementInArrayOfInt {

	public static void main(String[] args) {
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };

		int Largest = my_array1[0];
		int Second = my_array1[0];

		System.out.println("Array is ");
		System.out.println("--------");

		for (int i = 0; i < my_array1.length; i++) {
			System.out.println(my_array1[i] + "\n");

			if (my_array1[i] > Largest) {
				Second = Largest;
				Largest = my_array1[i];
			} else if (my_array1[i] > Second) {
				Second = my_array1[i];
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Second Largest Element in Array of Int is = " + Second);

	}

}
