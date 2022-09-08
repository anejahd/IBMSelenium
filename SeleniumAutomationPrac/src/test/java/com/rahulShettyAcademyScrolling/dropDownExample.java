package com.rahulShettyAcademyScrolling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;



public class dropDownExample {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement country = driver.findElement(By.cssSelector("#ui-id-53"));
		//country.sendKeys("United States (USA)");
		WebElement dropdown = driver.findElement(By.id("autocomplete"));
		dropdown.sendKeys("USA");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		driver.quit();


	}
}
