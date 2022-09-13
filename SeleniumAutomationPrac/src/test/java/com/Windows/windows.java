package com.Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
        
        driver.get("https://rahulshettyacademy.com/angularpractice");
        driver.switchTo().newWindow(WindowType.TAB);
        
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindowID = it.next(); //angularpractise
        String childWindow = it.next(); //rahulshetty index
        driver.switchTo().window(childWindow);
        driver.get("https://www.rahulshettyacademy.com/#/index");
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(5).getText();
        //System.out.println(courseName);
        driver.switchTo().window(parentWindowID);
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
        //driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);

        driver.quit();
        System.out.println(courseName);
	}

}
