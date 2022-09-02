package com.practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SeleniummPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String url = "www.google.com";
		driver.get(url);
		
		String acceptedTitle = "Google";
		String execpectedTtitle = driver.getTitle();
		
		Assert.assertEquals(acceptedTitle, execpectedTtitle);
	}

}
