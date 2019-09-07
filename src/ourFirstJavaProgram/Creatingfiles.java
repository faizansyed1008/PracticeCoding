package ourFirstJavaProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Creatingfiles {

	static File Newprogram = new File("C:\\Users\\faizs\\eclipse-workspace\\faizan.txt");

	public static void main(String[] args) throws IOException {

		try {
			if (Newprogram.createNewFile()) {
				System.out.println("File created: " + Newprogram.getName());

			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			System.out.println("an error occurred.");
			e.printStackTrace();
		}

		System.out.println("===============");///////////////

		if (Newprogram.exists()) {
			System.out.println("File name: " + Newprogram.getName());
			System.out.println("Absolute path: " + Newprogram.getAbsolutePath());
			System.out.println("Writeable: " + Newprogram.canWrite());
			System.out.println("Readable " + Newprogram.canRead());
			System.out.println("File size in bytes " + Newprogram.length());
		} else {
			System.out.println("The file does not exist");
		}

		FileWriter myWriter = new FileWriter("C:\\Users\\faizs\\eclipse-workspace\\faizan.txt");

		try {

			myWriter.write(
					" Hello World\n How are you\n How you doin\n have a good day\n have a nice day\n Do you even exist\n Whats wrong\n Time to go School\n No way\n Go Home  ");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

		try {

			Scanner myReader = new Scanner(Newprogram);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}