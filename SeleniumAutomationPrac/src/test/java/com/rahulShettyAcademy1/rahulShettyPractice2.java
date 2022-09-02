package com.rahulShettyAcademy1;

import org.testng.annotations.Test;
import com.rahulshettyacademy.rahulShettyAcademyHome;


import com.packt.base.BaseTest;

public class rahulShettyPractice2 extends BaseTest{
	
	protected String rahulShettyAcademyHomePage1 = "https://rahulshettyacademy.com/dropdownsPractise/#";

	@Test
	public void secondTest() {
		rahulShettyAcademyHome rahulShettyHomePage = new rahulShettyAcademyHome(driver);
		rahulShettyHomePage.open();
		driver.manage().window().maximize();
		

		
	}
}
