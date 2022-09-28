package com.date;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime; //import the LocalDateTime class
import java.time.format.DateTimeFormatter; //import the DatTimeFormatter class

public class currentDate {
	public static void main(String[] args) {
		
		LocalDate myObj = LocalDate.now(); //Create a date object
		System.out.println(myObj); //Display the current date
		
		//Current Time
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		//Current date and time and use now()
		LocalDateTime myCurrDate = LocalDateTime.now();
		System.out.println(myCurrDate);
		
		//Formatting Date and Time
		LocalDateTime myDateObj = LocalDateTime.now();
		LocalDateTime myDateDayObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		
		String formattDate = myDateObj.format(myFormatObj);
		String formattDateDay = myDateDayObj.format(myFormatObj1);
		System.out.println("After formatting: " + formattDate);
		System.out.println("After formatting: " + formattDateDay);
	}
	
	//ofPattern()
	//yyyy-MM-dd "1988-09-29"
	//dd/MM/yyyy "29/09/1988"
	//dd-MMM-yyyy "29-Sep-1988"
	//E, MMM dd yyyy "Thu, Sep 29 1988"
	

}
