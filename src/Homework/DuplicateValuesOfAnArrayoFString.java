package Homework;

public class DuplicateValuesOfAnArrayoFString {

	public static void main(String[] args) {
		String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {

				if ((my_array[i] == my_array[j])) {
					System.out.println("Duplicate Values Of An Array of Strings Are = " + my_array[j]);
				}
			}
		}

	}

}
