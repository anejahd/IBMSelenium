package com.rahulShettyAcademy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();
		
		
		WebElement continents = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//Create object of Select class
		Select oSelect = new Select(continents);
		
		oSelect.selectByVisibleText("USD");
		
		//to print the Select.
		WebElement myElem = oSelect.getFirstSelectedOption();
		System.out.println(myElem.getText());
		
		oSelect.selectByIndex(2);
		myElem = oSelect.getFirstSelectedOption();
		System.out.println(myElem.getText());
		
		//Select By value
		oSelect.selectByValue("INR");
		myElem = oSelect.getFirstSelectedOption();
		System.out.println(myElem.getText());
		
		driver.quit();
		
		
		
		
		
		//Create object with Select index
		
		//oSelect.selectByIndex(0)
		
	
		
	
		
		//driver.quit();
		
	}

}
