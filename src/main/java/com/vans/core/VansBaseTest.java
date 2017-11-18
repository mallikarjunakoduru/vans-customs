package com.vans.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class VansBaseTest {

	protected WebDriver driver=null;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		 driver= new FirefoxDriver();
		driver.get("https://www.vans.com/customs-mens.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
	}
	
	
	
	@AfterMethod
	public  void tearDown() {
	driver.close();
	}
	
}
