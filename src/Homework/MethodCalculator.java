package Homework;

import java.util.Scanner;

class Calculator {
	int a, b;

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int multi() {
		return a * b;
	}

	int div() {
		return a / b;
	}

	public class MethodCalculator {
	}

	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sr.nextInt();
		System.out.print("Enter b : ");
		int b = sr.nextInt();
		System.out.print("Enter the operetion (+,-,*,/) : ");
		String op = sr.next();
		int c = 0;
		Calculator obj = new Calculator(a, b);
		switch (op) {
		case "+":
			c = obj.add();
			break;
		case "-":
			c = obj.sub();
			break;
		case "*":
			c = obj.multi();
			break;
		case "/":
			c = obj.div();
			break;
		default:
			System.out.println("Invalid opration code!!");
		}

	}

}