package com.rahulShettyAcademy1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncImplicitExplict {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String[] newPhones = { "iphone x", "Samsung Note 8", "Nokia Edge", "Blackberry"};


		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		System.out.println("Entered username");
		driver.findElement(By.id("password")).sendKeys("learning");
		System.out.println("Entered password");
		
		driver.findElement(By.xpath("//form[@id='login-form']/div[4]/div/label[2]/span[@class='checkmark']")).click();
		System.out.println("Clicked user");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//button[@id='okayBtn']")));
		//driver.findElement(By.xpath("/html//button[@id='okayBtn']")).click();
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement profile = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select oSelect = new Select(profile);
		oSelect.selectByVisibleText("Consultant");


		driver.findElement(By.cssSelector("#terms")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> phone = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		for(int j = 0; j < phone.size(); j++) {
			
			int f = 0;
			phone.get(j).click();
			//System.out.println(phone.get(j).newPhones[f]);
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.quit();

	}
	
}
