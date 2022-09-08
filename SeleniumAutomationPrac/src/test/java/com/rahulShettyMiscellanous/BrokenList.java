package com.rahulShettyMiscellanous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenList {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		
		//which links for working or failed
		
		//broken link
		//check network and use the status. 200 works but 404 doesn't work
		//Java methods will call URL's and gets you the status code
		//Step 1 - is to get all urls tied up to the links using selenium
		//if status code 400 then the url is not working > link which is tied to url is broken
		//a[href*="soapui"]
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		
		
		driver.quit();
		
		

	}

}
