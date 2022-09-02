package com.rahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selectCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String homePage = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.get(homePage);
		
		WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		
		option1.click();
		System.out.println("select option1 checkbox");
		boolean checkOption1Displayed = option1.isDisplayed();
		Assert.assertTrue(checkOption1Displayed);
		
		option1.click();
		System.out.println("unchecked option1");
		boolean uncheckedOption1Displayed = option1.isDisplayed();
		Assert.assertFalse(uncheckedOption1Displayed);
		
		driver.quit();
	}

}
