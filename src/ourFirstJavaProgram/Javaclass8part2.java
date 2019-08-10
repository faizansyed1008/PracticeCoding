package ourFirstJavaProgram;
import java.util.Scanner;
public class Javaclass8part2 {

	public static void main(String[] args) {
		Scanner looping = new Scanner(System.in);
		
		int value =0;
		do {
			System.out.println("enter number:");
			 value = looping.nextInt();
		}
		while(value !=5);
		//if the statement is true it will keep on looping if the statement is false it will exit the loop
		System.out.println("congratulations");

	}

}
