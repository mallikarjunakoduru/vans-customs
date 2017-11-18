package com.vans.Classic.Sk8HiClassic.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.vans.core.VansBasePage;

public class Sk8HiClassicPage extends VansBasePage {

	public Sk8HiClassicPage(WebDriver driver) {
		super(driver);	
	}
	
	
	
	
	
	@FindBy(xpath = "//span[@class='selector-style-name'][text()='Sk8-Hi']")
	WebElement sk8hi;
	
	
	
	

	
	
	

	public void clickOnSk8HiClassic() throws InterruptedException {
		sk8hi.click();
		Thread.sleep(5000);

	}
	
	public void getBaseURl(WebDriver driver) {
		String actualurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, "https://www.vans.com/customizer.sk8-hi.html?recipe=ac06d5fc63ae085468c13a444561245f");
	
	}
	public void clickOnAddToCart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtocart);
		Thread.sleep(5000);
		switchwindow(driver);
		Assert.assertEquals(minicartitemname.getText(), "WOMENS CUSTOM SK8-HI PT");

	}
	


	public void flyoutmenu(WebDriver driver) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println(flyoutvisibletext.getText());

		for (int i = 1; i <= 9; i++) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("var evt = document.createEvent('MouseEvents');"
					+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
					+ "arguments[0].dispatchEvent(evt);", flyoutnext);

			System.out.println(flyoutvisibletext.getText());
			List<String> list = new ArrayList<>();
			list.add(flyoutvisibletext.getText());
			String[] strs = {"QUARTERS","SIDE STRIPE","HEEL COUNTER","EYELETS","EYESTAY","COLLAR LINING","FOXING","FOXING STRIPE","LACES" };

			Assert.assertEquals(strs[count], flyoutvisibletext.getText());
			count++;

		}
		
	}
	
	
	public void upcgargematerial() {
		String actualtext = buybutton.getText();
		String expectedtext = "$95.00";
		Assert.assertEquals(actualtext, expectedtext);

	}
	
	
	
	
	public void startover(WebDriver driver) throws InterruptedException {
		startoverbutton.click();
		Thread.sleep(2000);
		System.out.println(yesstartoverbutton.isDisplayed());
	
		yesstartoverbutton.click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(buybutton.getText(), "$85.00");
		
		
		
	}
	
	

}

	
	
	
	
	
	
	


