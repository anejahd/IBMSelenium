package com.Windows;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
        
        driver.get("https://rahulshettyacademy.com/angularpractice");
        driver.switchTo().newWindow(WindowType.TAB);
        //driver.switchTo().newWindow(WindowType.WINDOW);

        
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindowID = it.next(); //angularpractise
        String childWindow = it.next(); //rahulshetty index
        driver.switchTo().window(childWindow);
        driver.get("https://www.rahulshettyacademy.com/#/index");
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(5).getText();
        //System.out.println(courseName);
        driver.switchTo().window(parentWindowID);
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
        
        //Capture webelement screenshot using Selenium
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("/Users/ANEJAHDANIELS/screenshot/logo.png"));
        
        /*height
        System.out.println(name.getRect().getDimension().getHeight());
        //width
        System.out.println(name.getRect().getDimension().getWidth());*/

        
        System.out.println(courseName);
        driver.quit();

	}
}
