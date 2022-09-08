package com.rahulShettyMiscellanous;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		//delete cookies in the browse
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		
		//Click on any link login page- verify login url
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		//convert the screenshot to an object
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/ANEJAHDANIELS/screenshot/screenshot.png"));
		driver.quit();

	}

}
