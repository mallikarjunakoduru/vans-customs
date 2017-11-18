package com.vans.ProSkate.AuthenticPro.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vans.core.VansBasePage;

public class AuthenticProPage extends VansBasePage {

	public AuthenticProPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//span[@class='selector-style-name'][text()='Authentic Pro']")
	WebElement authenticpro;

	@FindBy(xpath = "html/body/div[2]/section/div/div[4]/div/div/div/div/section/div/ul/li[2]")
	WebElement prostaketab;

	public void getBaseURl(WebDriver driver) {
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl,
				"https://www.vans.com/customizer.authentic-pro.html?recipe=c8b91c9c43865c861c57626d55b23f18");

	}

	public void clickOnAddToCart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtocart);
		Thread.sleep(2000);
		switchwindow(driver);
		Assert.assertEquals(minicartitemname.getText(), "Mens Custom Sk8-Hi Pro");

	}

	public void flyoutmenu(WebDriver driver) {
		int count = 0;
		System.out.println(flyoutvisibletext.getText());

		for (int i = 1; i <= 8; i++) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("var evt = document.createEvent('MouseEvents');"
					+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
					+ "arguments[0].dispatchEvent(evt);", flyoutnext);

			System.out.println(flyoutvisibletext.getText());
			List<String> list = new ArrayList<>();
			list.add(flyoutvisibletext.getText());
			String[] strs = { "QUARTERS", "HEEL STRIP", "TONGUE", "BINDING", "EYELETS", "FOXING", "FOXING STRIPE",
					"LACES" };

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

	public void clickOnAuthenticPro(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", prostaketab);
		Thread.sleep(4000);
		authenticpro.click();
		Thread.sleep(4000);

	}

	public void SizeDropdownVerification() {
		// TODO Auto-generated method stub
		Select select = new Select(sizedropdown);
		List<WebElement> options = select.getOptions();
		int count = 0;
		for (WebElement we : options) {
			count++;
			System.out.println(we.getText());
		}
		Assert.assertEquals(count, 14);

	}


}
