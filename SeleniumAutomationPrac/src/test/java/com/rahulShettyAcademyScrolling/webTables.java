package com.rahulShettyAcademyScrolling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTables {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//javscript to scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.table-display').scrollTop=5000");
		
		List <WebElement> values = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println("Number of rows:"+ values.size());
		
		List <WebElement> columns = driver.findElements(By.cssSelector(".table-display th"));
		
		for(int i = 0; i <columns.size(); i++) {
			System.out.println("Column name:" + columns.get(i).getText());
		}
		//".table-display tr:nth-child(3) .table-display tr td"
		List <WebElement> course = driver.findElements(By.cssSelector(".table-display tr td"));	
		System.out.println(course.get(4).getText());
		System.out.println(course.get(5).getText());
		System.out.println(course.get(6).getText());

		/*WebElement table = driver.findElement(By.id("product"));

		List <WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));


		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());



		System.out.println(secondrow.get(2).getText());*/
			
		driver.quit();


	}

}
