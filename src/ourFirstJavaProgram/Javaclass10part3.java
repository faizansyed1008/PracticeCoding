package ourFirstJavaProgram;

public class Javaclass10part3 {

	public static void main(String[] args) {

		// for enhanced loop
		char[] lowercase = { 'a', 'b', 'c', 'd', 'e', 'f' };

//		char d = lowercase[3];
		int index = 0;
		for (char singleChar : lowercase) {
			System.out.println(singleChar);
			if (singleChar == 'd') {

				lowercase[index] = 'D';
			}
			if (singleChar == 'e') {

				lowercase[index] = 'E';
			}
			if (singleChar == 'b') {

				lowercase[index] = 'B';
			}
			if (singleChar == 'a') {

				lowercase[index] = 'A';
			}
			if (singleChar == 'f') {

				lowercase[index] = 'F';
				}
			if (singleChar == 'c') {

				lowercase[index] = 'C';
			}
			index++;

		}

		System.out.println(lowercase);

	}

}
