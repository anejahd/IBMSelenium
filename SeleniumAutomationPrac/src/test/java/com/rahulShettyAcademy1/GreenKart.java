package com.rahulShettyAcademy1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String[] itemsNeeded = {"Cucumber", "Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText();
			
			
			//List itemsNeedList = Arrays.asList(itemsNeeded);
			
			if (name.contains("Cucumber")) {
				// click add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				System.out.println("Clicked Add to Cart");
				break;
			}
		}
		Thread.sleep(5000);

		driver.quit();

	}

}
