package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class finalSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://ww.google.com";
		
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Page opened");
		
		String acceptedTitle = "Google";
		String exceptedTitle = driver.getTitle();
		
		Assert.assertEquals(acceptedTitle, exceptedTitle);
		System.out.println("Exepcted Title: " + exceptedTitle);
		
		driver.quit();
	}

}
