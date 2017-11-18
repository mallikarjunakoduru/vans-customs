package com.vans.Classic.AuthenticClassic.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.vans.core.VansBasePage;

public class AuthenticClassicPage  extends VansBasePage{


	public AuthenticClassicPage(WebDriver driver) {
		super(driver);
		
	}



	@FindBy(xpath = "//span[@class='selector-style-name'][text()='Authentic']")
	WebElement authentic;
	
	
	

	public void clickOnAuthenticClassic() throws InterruptedException {
		authentic.click();
		Thread.sleep(5000);

	}
	
	public void getBaseURl(WebDriver driver) {
		String actualurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, "https://www.vans.com/customizer.authentic-classic.html?recipe=6f2bd0c01eeb21a31836c2b9dc8be262");
	
	}
	public void clickOnAddToCart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtocart);
		Thread.sleep(2000);
		switchwindow(driver);
		Assert.assertEquals(minicartitemname.getText(), "WOMENS CUSTOM AUTHENTIC PT");

	}
	


	public void flyoutmenu(WebDriver driver) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println(flyoutvisibletext.getText());

		for (int i = 1; i <= 7; i++) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("var evt = document.createEvent('MouseEvents');"
					+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
					+ "arguments[0].dispatchEvent(evt);", flyoutnext);

			System.out.println(flyoutvisibletext.getText());
			List<String> list = new ArrayList<>();
			list.add(flyoutvisibletext.getText());
			String[] strs = { "QUARTERS","BINDING","TONGUE","EYELETS","FOXING","FOXING STRIPE","LACES" };

			Assert.assertEquals(strs[count], flyoutvisibletext.getText());
			count++;

		}
		
	}

}
