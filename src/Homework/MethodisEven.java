package Homework;

import java.util.Scanner;

public class MethodisEven {

	public static void main(String[] args) {
		  Scanner median = new Scanner(System.in);
	        System.out.print("Input a string: ");
	        String str = median.nextLine();
	        System.out.print("The middle character in the string is, "+middle(str));
	    }
	 public static String middle(String character)
	    {
	        int position;
	        int length;
	        if (character.length() % 2 == 0)
	        {
	            position = character.length() / 2 - 1;
	            length = 2;
	        }
	        else
	        {
	            position = character.length() / 2;
	            length = 1;
	        }
	        return character.substring(position, position + length);

	}

}
