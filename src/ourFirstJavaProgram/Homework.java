package ourFirstJavaProgram;

//write a program to display any table
import java.util.*;
public class Homework {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
            int i, t;
			System.out.print("Enter table number");
			t = sc.nextInt();
			i = 1;
			while(i<=10) {
				System.out.println(i+"*"+t+"="+i*t);
				i++;
			}
             System.out.print("do you want to countinue(Y/N):");
		     choice = sc.next().charAt(0);
		     
	   }while(choice =='y'||choice == 'Y');
       sc.close();
	   }
	
	
}

	
	
	
