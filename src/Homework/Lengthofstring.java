package Homework;

public class Lengthofstring {

	public static void main(String[] args) {
		String name = faizanCode("pizza", 5);
		System.out.println(name);

	}

	public static String faizanCode(String str, int length) {

		String newstr = null;

		if (str.length() == length) {

			newstr = str;

		} else if (str.length() > length) {

			newstr = str.substring(str.length() - length);

		} else if (str.length() < length) {
			int difference = length - str.length();

			System.out.println("I need to loop <" + difference + ">time");

			while (difference >= 0) {
				str = str.concat("n");
				if (str.length() == length) {
					break;
				}

				difference--;
			}
			newstr = str;

		}
		return newstr;

	}
}
