package ourFirstJavaProgram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_Date {

	public static void main(String[] args) {
		
		
		   //local date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		  //local time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		  //local date time
		LocalDateTime myObj = LocalDateTime.now();
		System.out.println(myObj);
		
		 //dateTimeFormatter
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " +myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:");
		
		
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
		
		

	}

}
