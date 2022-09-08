package com.rahulShettyAcademyScrolling;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class dropDownExam {



public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");



driver.findElement(By.id("autocomplete")).sendKeys("United States (USA");

Thread.sleep(3000);

List<WebElement> countries = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));

for(WebElement country : countries) {

if(country.getText().equalsIgnoreCase("United States (USA")) {

country.click();

break;

}

}
driver.quit();
}



}


		
