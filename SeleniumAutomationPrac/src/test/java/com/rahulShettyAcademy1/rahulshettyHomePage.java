package com.rahulShettyAcademy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.packt.base.BasePageObject;
import com.packt.base.BaseTest;
import com.rahulshettyacademy.rahulShettyAcademyHome;

public class rahulshettyHomePage extends BaseTest {
	
	/*@DataProvider(name = "RahulShettyAcademyTest")
	public static Object[][] RahulShettyAcademyTest() {
		return new Object[][] {
			{"anejahd@gmail.com, Koolkid12!"}
		};
	}*/
	
	@Test
	//(dataProvider = "RahulShettyAcademyTest")
	public void firstTest() {
		rahulShettyAcademyHome rahulHomePage = new rahulShettyAcademyHome(driver);
		
		rahulHomePage.open();
		rahulHomePage.rSGetTitle();
		rahulHomePage.selectFromDropdown();
		rahulHomePage.selectToDropdown();
		rahulHomePage.depatureDate();
		rahulHomePage.clickSearch();
		
		
		
		
		
		
	}

}
