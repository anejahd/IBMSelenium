package com.rahulShettyAcademy1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateGreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

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
		Thread.sleep(5000);
		driver.quit();

	}

}
