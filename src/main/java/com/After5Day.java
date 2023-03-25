package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class After5Day {
	
	  public static void main(String[] args) {
		  
	    // Get today's date
		  
	    LocalDate today = LocalDate.now();
	    
	    // Add 5 days
	    
	    LocalDate after5Days = today.plusDays(5);
	    
	    // Format the date as a string
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
	    String dayAfter5Days = after5Days.format(formatter);
	    
	    // Print the day after 5 days
	    
	    System.out.println("The day after 5 days from today is: " + dayAfter5Days);
	  }
	}



