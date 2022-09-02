package com.rahulShettyAcademy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sendPostCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/angularpractice/";
		driver.manage().window().maximize();
		driver.get(url);
		
		//send first name
		driver.findElement(By.name("name")).sendKeys("Anejah Crooms");
		
		//send email
		driver.findElement(By.name("email")).sendKeys("hello@mail.com");
		
		//send password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("09876");
		
		
		//Click Ice Cream notification
		WebElement checkboxIceCream = driver.findElement(By.id("exampleCheck1"));
		checkboxIceCream.click();
		if(checkboxIceCream.isEnabled()) {
			System.out.println("Check me out if you Love IceCreams!");
		}
		else {
			System.out.println("Button did click for Check me out if you Love IceCreams!");	
		}
		
		//Click male or female
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select oSelect = new Select(gender);
		
		oSelect.selectByVisibleText("Female");
		System.out.println("I am a " + oSelect);
		
		//Click employment status
		WebElement employmentStatus = driver.findElement(By.id("inlineRadio1"));
		employmentStatus.click();
		System.out.println("Employment Status: " + employmentStatus);
		
		//Enter birthday
		driver.findElement(By.name("bday")).sendKeys("11/18/1993");

		
		//Enter submit
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		driver.quit();

	}

}
