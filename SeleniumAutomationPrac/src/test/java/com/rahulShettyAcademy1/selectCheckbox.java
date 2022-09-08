package com.rahulShettyAcademy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selectCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String homePage = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.get(homePage);
		
		WebElement option1 = driver.findElement(By.name("checkBoxOption1"));
		//select option1 checkbox
		option1.click();
		WebElement optionName = driver.findElement(By.cssSelector("label[for='bmw']"));
		System.out.println("Clicked " + optionName.getText());
		boolean checkOption1Displayed = option1.isDisplayed();
		Assert.assertTrue(checkOption1Displayed);
		
		//count the number of checkbox
		List <WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
	    System.out.println("Number of elements:" + checkboxes.size());
	      
		
		option1.click();
		System.out.println("Unchecked " + optionName.getText());
		boolean uncheckedOption1Displayed = option1.isSelected();
		Assert.assertFalse(uncheckedOption1Displayed);
		
		driver.quit();

	}

}
