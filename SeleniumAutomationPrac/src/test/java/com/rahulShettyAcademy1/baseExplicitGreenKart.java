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
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseExplicitGreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//open webdriver
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(120, 1));

		
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		//create Vegetable and add item
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//div[@id='root']/div[@class='container']/header/div[@class='container']//button[@type='button']")).click();
		//driver.findElement(By.xpath("//div[@id='root']/div[@class='container']/div[@class='products-wrapper']//input[@type='text']")).sendKeys("rahulshettyacademy");
		System.out.println("Entered promo code");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//explicit wait 

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		System.out.println("Promo code applied successfully");
		//driver.findElement(By.xpath("//div[@id='root']/div[@class='container']/div[@class='products-wrapper']//button[.='Place Order']")).click();
		driver.quit();


	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// Brocolli - 1 Kg
			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual veg name
			/// check whether name you extracted is present in array or not -
			// convert array into array list easy search

			List<String> itemsNeedList = Arrays.asList(itemsNeeded);

			if (itemsNeedList.contains(formattedName)) {

				j++;
				// click add to cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); old format
				System.out.println("Clicked " + formattedName);
				// 3times
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
