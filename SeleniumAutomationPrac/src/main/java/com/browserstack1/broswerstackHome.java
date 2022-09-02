package com.browserstack1;

import org.openqa.selenium.WebDriver;

import com.packt.base.BasePageObject;

public class broswerstackHome extends BasePageObject{
	
	String browserStackWebpage = "https://www.browserstack.com";
	
	public void open() {
		openURL(browserStackWebpage);
	}	
	
	
	public broswerstackHome(WebDriver driver) {
		super(driver);
	}

}
