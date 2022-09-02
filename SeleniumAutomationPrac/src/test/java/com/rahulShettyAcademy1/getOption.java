package com.rahulShettyAcademy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();
		
		WebElement continents = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				
		Select oSelect = new Select(continents);
		
		List <WebElement> elementCount = oSelect.getOptions();
		
		System.out.println(elementCount.size());
		
		for(int i = 0; i < elementCount.size(); i++) {
			System.out.println(elementCount.get(i).getText());
		}
		
		driver.quit();

	}

}
