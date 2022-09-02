package com.rahulShettyAcademyE2EProgramming;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// 1. give me the count of the links on the page.
		// a - anchor

		driver.findElements(By.tagName("a")).size();
		System.out.println("Rahul Shetty Academy All Links:" + driver.findElements(By.tagName("a")).size());

		// 2. count of footer section
		WebElement footdriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		footdriver.findElements(By.tagName("a")).size();
		System.out.println("Rahul Shetty Academy Footer Links:" + footdriver.findElements(By.tagName("a")).size());

		// 3. count of all first column for the footer

		WebElement udemyFooter = driver.findElement(By.xpath("//div[@id='gf-BIG']/table[@class='gf-t']//tr/td[1]"));
		udemyFooter.findElements(By.tagName("a")).size();
		System.out.println("uDemy Discount Coupons Link:" + udemyFooter.findElements(By.tagName("a")).size());

		// another example
		//WebElement columndriverfooter = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		//columndriverfooter.findElements(By.tagName("a")).size();
		//System.out.println("uDemy Discount Coupons Link:" + columndriverfooter.findElements(By.tagName("a")).size());

		// click on each link in the column and check if pages are opening-
		for (int i = 1; i < udemyFooter.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			udemyFooter.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(500L);
		}
		Set<String> abc = driver.getWindowHandles(); // 4
		Iterator<String> it = abc.iterator();

		

		while (it.hasNext()) {
			driver.switchTo().window(it.next()); // identity will move to the second index to switch the window
			System.out.println(driver.getTitle() + " page opened");
		}
			
		driver.quit();

	}

}
