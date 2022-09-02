package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	@BeforeClass
	public void openWebPage() {
		System.out.println("Open Webpage");
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void login () {
		
	}
	
	@Test
	public void checkPageTitle() {
		System.out.println("Check Page Title");
	}
	
	

}
