package com.vans.ProSkate.Sk8HiPro.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vans.core.VansBasePage;

public class Sk8HiProPage extends VansBasePage {

	public Sk8HiProPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@class='selector-style-name'][text()='Sk8-Hi Pro']")
	WebElement sk8hipro;

	@FindBy(xpath = "html/body/div[2]/section/div/div[4]/div/div/div/div/section/div/ul/li[2]")
	WebElement prostaketab;

	public void getBaseURl(WebDriver driver) {
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl,
				"https://www.vans.com/customizer.sk8-hi-pro.html?recipe=6658bb21e32ab1e3372b5ae9971816ee");

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
			String[] strs = { "QUARTERS", "SIDE STRIPE", "HEEL COUNTER", "EYESTAY", "EYELETS", "COLLAR LINING",
					"FOXING", "FOXING STRIPE", "LACES" };

			Assert.assertEquals(strs[count], flyoutvisibletext.getText());
			count++;

		}

	}

	public void upcgargematerial() {
		String actualtext = buybutton.getText();
		String expectedtext = "$105.00";
		Assert.assertEquals(actualtext, expectedtext);

	}

	public void startover(WebDriver driver) throws InterruptedException {
		startoverbutton.click();
		Thread.sleep(2000);
		System.out.println(yesstartoverbutton.isDisplayed());

		yesstartoverbutton.click();

		Thread.sleep(3000);

		Assert.assertEquals(buybutton.getText(), "$95.00");

	}

	public void clickOnSk8HiPro(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", prostaketab);

		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", sk8hipro);

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
