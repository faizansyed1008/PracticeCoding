package forLoopClasses;

import java.util.Scanner;

public class ForloopTable {

	public static void main(String[] args) {

		Scanner table = new Scanner(System.in);
		System.out.println("Please Enter Your Multiplication Number");
		int number = table.nextInt();
		System.out.println("Table of " + number + " is\n");
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " x " + i + " = " + result);
		}

	}

}
