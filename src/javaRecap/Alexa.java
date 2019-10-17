package javaRecap;

import java.time.LocalDateTime;

public class Alexa implements Alarm{
	    public void alexaWhatTimeIsIt() {
	        System.out.println("Its "+LocalDateTime.now());
	    }
	    
	    public void setAlarm() {
	        System.out.println("Setting alarm for 6 AM!!");
	    }
	}
	