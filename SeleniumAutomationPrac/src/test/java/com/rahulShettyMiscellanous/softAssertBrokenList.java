package com.rahulShettyMiscellanous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class softAssertBrokenList {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//checking for all links 
		//which links for working or failed
		
				//broken link
				//check network and use the status. 200 works but 404 doesn't work
				//Java methods will call URL's and gets you the status code
				//Step 1 - is to get all urls tied up to the links using selenium
				//if status code 400 then the url is not working > link which is tied to url is broken
				//a[href*="soapui"]
		List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link: links) {
			link.getAttribute("href");
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			if(respCode>400) {
				//System.out.println("The links with the Text " + link.getText()+" is broken with code"+ respCode );
				a.assertTrue(respCode<400,"The links with the Text " + link.getText()+" is broken with code"+ respCode  );
			}
			
		}
		a.assertAll();	
		driver.quit();
		


	}

}	
	
