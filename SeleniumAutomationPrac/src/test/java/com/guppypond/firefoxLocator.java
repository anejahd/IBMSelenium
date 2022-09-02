package com.guppypond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/ANEJAHDANIELS/FireFoxDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "https://sso.teachable.com/secure/9521/identity/sign_up/with_email";
		
		
		System.out.println("Opening page: " + url);
		driver.get(url);
		System.out.println("Page Opened");
		
		driver.findElement(By.id("user_name")).sendKeys("anejahd@gmail.com");
		//driver.findElement(By.className("theme-btn")).click();
		//System.out.println("Click Register");
		
		driver.quit();


	}

}
