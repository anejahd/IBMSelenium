package com.rahulShettyAcademy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceRahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.manage().window().maximize();
		

		
		WebElement onWayButton = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		
		boolean results;
		results = onWayButton.isSelected();
		System.out.println(results);
		driver.quit();
		
		
	}
	
	

}
