package javaRecap;

import java.time.LocalDateTime;

public class Clock implements Alarm {
	
	   
	   public void showTime() {
	        System.out.println(LocalDateTime.now());
	   }
	   @Override
	   public void setAlarm() {
	        System.out.println("Setting alarm for 6 AM!!");
	   }
	
}
