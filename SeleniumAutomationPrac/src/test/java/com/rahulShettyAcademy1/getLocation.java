package com.rahulShettyAcademy1;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		//maximize the page
		driver.manage().window().maximize();
		
		//Get the webelement
		WebElement element = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		
		//Create instance of Dimension class of get size of the element
		 Point location = element.getLocation();
		 
		 //print location
		 
		 System.out.println("Location fo the button " + location);
		 System.out.println("X coordinate: " + location.x);
		 System.out.println("Y coodinate: " + location.y);
		
		
		
		driver.quit();

	}

}
