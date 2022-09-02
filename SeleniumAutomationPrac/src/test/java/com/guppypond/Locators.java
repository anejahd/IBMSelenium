package com.guppypond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/";
		
		
		System.out.println("Opening page: " + url);
		driver.get(url);
		
		//Resize current window to the set dimension
	    driver.manage().window().maximize();
	    //To Delay execution for 10 sec. as to view the maximize browser
	    //  Thread.sleep(10000);
	    
		System.out.println("Page Opened");
		driver.findElement(By.xpath("/html//app-root/div[@class='page-wrapper']/header[@class='main-header']/div[@class='header-top']//a[@href='https://courses.rahulshettyacademy.com/sign_up']")).click();
		System.out.println("Click register");
		//Entering Full Name
		driver.findElement(By.id("user_name")).sendKeys("Anejah Crooms");
		driver.findElement(By.id("user_email")).sendKeys("anejahd@gmail.com");
		System.out.println("Entering Full name and email");
		driver.findElement(By.id("password")).sendKeys("Koolkid12!");
		System.out.println("Entering password");
		
		//selecting checkbox
		WebElement agreementRahulShettyAcademy = driver.findElement(By.id("allow_marketing_emails"));		
		agreementRahulShettyAcademy.click();
		
		
		driver.findElement(By.name("commit")).click();
		System.out.println("Registered RHA");
		driver.quit();
		

		

	}

}
