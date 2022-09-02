package com.rahulShettyAcademy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Anejah";
		String text1 = "Benny";
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Click alert
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		//driver.findElement(By.id("alertbtn")).click();
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println("Click alert");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("Clicked Alert");
		
		
		//Click confirm
		driver.findElement(By.id("name")).sendKeys(text1);
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println("Click confirm");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println("Clicked canceled");

		
		driver.quit();

	}

}
