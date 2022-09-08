package com.rahulShettyMiscellanous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		//delete cookies in the browse
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		
		//Click on any link login page- verify login url
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
