package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PracticeSeleniumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("Webpage opened");
		
		String acceptedTitle = "Google";
		String expectedTitle = driver.getTitle();
		
		Assert.assertEquals(acceptedTitle, expectedTitle);

	}

}
