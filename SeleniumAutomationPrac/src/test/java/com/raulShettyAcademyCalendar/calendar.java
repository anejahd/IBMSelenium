package com.raulShettyAcademyCalendar;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
	
		driver.get("https://www.path2usa.com/travel-companions");
		//open calendar
		driver.findElement(By.cssSelector("#travel_date")).click();
		//month element
		driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']")).getText().contains("November");
		
		
		//true or false for the element. negation
		while(!driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']")).getText().contains("November")) 
		{
			driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='next']")).click();
		}
		
		/*
		while(true) {  //while loop	until you find the element(Novemeber). executing until it becomes false		
		}*/
		
		
		List <WebElement> dates = driver.findElements(By.className("day"));
		//List<WebElement> date = driver.findElements(By.className("text form-control"));
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count;i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("18")) {
				
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		Thread.sleep(5000l);
		driver.quit();
	}

}
