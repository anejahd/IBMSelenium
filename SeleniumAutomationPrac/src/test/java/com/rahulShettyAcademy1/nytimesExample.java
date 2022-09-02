package com.rahulShettyAcademy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class nytimesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:nytimes.com");
		System.out.println("Page opened");
		
		//using links to display all links and print findElements
		driver.manage().window().maximize();
		List <WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		
		for(int i = 0; i <links.size(); i++) {
			System.out.println(i + " " + links.get(i).getText());
		}
	}

}
