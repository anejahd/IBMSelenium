package com.rahulShettyAcademy1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		
		Dimension size = element.getSize();
		
		System.out.println("Size of button " + size);
		System.out.println("Width " + size.width);
		System.out.println("Height " + size.height);
		System.out.println("Width if button " + size.getWidth());
		System.out.println("Height of button " + size.getHeight());
		
		driver.quit();

	}

}
