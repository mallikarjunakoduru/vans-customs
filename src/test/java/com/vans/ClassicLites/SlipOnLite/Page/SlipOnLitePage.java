package com.vans.ClassicLites.SlipOnLite.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vans.core.VansBasePage;

public class SlipOnLitePage extends VansBasePage {

	public SlipOnLitePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//span[@class='selector-style-name'][text()='Slip-On Lite']")
	WebElement sliponlite;

	@FindBy(xpath = "html/body/div[2]/section/div/div[4]/div/div/div/div/section/div/ul/li[4]")
	WebElement litestab;

	public void getBaseURl(WebDriver driver) {
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl,
				"https://www.vans.com/customizer.slip-on-lite.html?recipe=e2e8c35c002b43204fd23c72a2171b14");

	}

	public void clickOnAddToCart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtocart);
		Thread.sleep(2000);
		switchwindow(driver);
		Assert.assertEquals(minicartitemname.getText(), "MENS CUSTOM ERA MTE");

	}

	public void flyoutmenu(WebDriver driver) {
		int count = 0;
		System.out.println(flyoutvisibletext.getText());

		for (int i = 1; i <= 6; i++) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("var evt = document.createEvent('MouseEvents');"
					+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
					+ "arguments[0].dispatchEvent(evt);", flyoutnext);

			System.out.println(flyoutvisibletext.getText());
			List<String> list = new ArrayList<>();
			list.add(flyoutvisibletext.getText());
			String[] strs = { "QUARTERS", "HEEL COUNTER", "BINDING", "COLLAR LINING", "FOXING", "ELASTIC GORE" };

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



	public void SizeDropdownVerification() {
		// TODO Auto-generated method stub
		Select select = new Select(sizedropdown);
		List<WebElement> options = select.getOptions();
		int count = 0;
		for (WebElement we : options) {
			count++;
			System.out.println(we.getText());
		}
		Assert.assertEquals(count, 33);

	}

	public void clickOnSliponlite(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", litestab);
		Thread.sleep(4000);
		sliponlite.click();
		Thread.sleep(4000);
		
	}


}



