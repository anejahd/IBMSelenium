package com.rahulshettyacademy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.packt.base.BasePageObject;

public class rahulShettyAcademyHome extends BasePageObject {
	
	protected String rahulShettyAcademyHomePage1 = "https://rahulshettyacademy.com/dropdownsPractise/#";
	
	By rsFromDropdown = By.id("ctl00_mainContent_ddl_originStation1_CTXTaction");
	By rsToDropdown = By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction"); 
	By rsAdampur = By.xpath("//table[@id='citydropdown']//td[@class='mapbg']/div[@class='search_options_menucontent']/div[1]/div/ul[1]/li[1]/a[@href='#']");
	By rsBhopal = By.xpath("//div[@id='flightSearchContainer']/div[3]//div[@class='right1']/div[@class='search_options_menucontentbg']/div/table[@id='citydropdown']//div[@class='search_options_menucontent']/div[1]/div/ul[1]/li[1]/a[@href='#']");
	By rsDepatureDate = By.xpath("//div[@id='ui-datepicker-div']/div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[3]/a[@href='#']");
	By rsSearch = By.id("ctl00_mainContent_btn_FindFlights");
	By oneWayButton = By.id("ctl00_mainContent_rbtnl_Trip_0");
	By countrySelect = By.id("autosuggest");
	
	public void rSGetTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		System.out.println("The title is " + actualTitle);
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	public void open() {
		openURL(rahulShettyAcademyHomePage1);
		
	}
	
	public void selectFromDropdown() {
		find(rsFromDropdown).click();
		find(rsAdampur).click();
		
	}
	
	public void selectToDropdown() {
		find(rsToDropdown).click();
		find(rsBhopal).click();
		
	}
	
	public void depatureDate() {
		find(rsDepatureDate).click();
	}
	
	public void clickSearch() {
		find(rsSearch).click();
	}
	 public void selectCurreny() {
		 
	 }
	
	/*public void screenshot() {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}*/
		
	public rahulShettyAcademyHome(WebDriver driver) {
		super(driver);
	}
	
	

}
