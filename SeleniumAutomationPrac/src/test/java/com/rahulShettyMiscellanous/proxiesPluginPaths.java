package com.rahulShettyMiscellanous;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class proxiesPluginPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using proxy for your project
		//HashMap to create the setting key
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "/Users/ANEJAHDANIELS/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize(); 
		driver.get("https://expired.badssl.com");
		
		Map<String, Object> pref = new HashMap<String, Object>();
		
		pref.put("download.default_directory", "/directory/path");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
