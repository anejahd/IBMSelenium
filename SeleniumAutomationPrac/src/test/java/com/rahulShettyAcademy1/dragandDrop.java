package com.rahulShettyAcademy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class dragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		//Action class menthod to drag and drop
		Actions builder = new Actions(driver);
		
		//Select elements 
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		//Perform drag to drop
		builder.dragAndDrop(from, to).perform();
		
		String textTo = to.getText();
	
		
		if(textTo.equals("Dropped!")) {
			System.out.println("Pass: Soruce is dropped to target as expected");
		}else {
			System.out.println("Failed: Source couldn't not be dropped target to as expected");
		}
		
		driver.quit();
		
		
		
		

	}

}
