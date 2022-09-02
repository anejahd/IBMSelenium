package com.packt.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser"})
	protected void setUp(@Optional("Chrome") String browser) {
		System.out.println("[Setting up webdriver" + browser + "]");
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@AfterClass(alwaysRun = true)
	protected void tearDown() {
		System.out.println("Tearing Down");
		driver.quit();
	}
	

}
