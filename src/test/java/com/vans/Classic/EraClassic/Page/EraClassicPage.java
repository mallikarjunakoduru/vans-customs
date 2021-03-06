package com.vans.Classic.EraClassic.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.vans.core.VansBasePage;

public class EraClassicPage  extends VansBasePage{

	public EraClassicPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@class='selector-style-name'][text()='Era']")
	WebElement eraclassic;

	public void clickOnOldSkoolClassic() throws InterruptedException {
		eraclassic.click();
		Thread.sleep(5000);

	}

	public void getBaseURl(WebDriver driver) {
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl,
				"https://www.vans.com/customizer.era-classic.html?recipe=64e6d5ff62220a6c7e9e4e074020dc72");

	}

	public void clickOnAddToCart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtocart);
		Thread.sleep(5000);
		switchwindow(driver);
		Assert.assertEquals(minicartitemname.getText(), "WOMENS CUSTOM ERA PT");

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
			String[] strs = {"QUARTERS","HEEL COUNTER","COLLAR LINING","TONGUE","BINDING","EYELETS","FOXING","FOXING STRIPE","LACES" };

			Assert.assertEquals(strs[count], flyoutvisibletext.getText());
			count++;

		}

	}

	public void upcgargematerial() {
		String actualtext = buybutton.getText();
		String expectedtext = "$85.00";
		Assert.assertEquals(actualtext, expectedtext);

	}

	public void startover(WebDriver driver) throws InterruptedException {
		startoverbutton.click();
		Thread.sleep(2000);
		System.out.println(yesstartoverbutton.isDisplayed());

		yesstartoverbutton.click();

		Thread.sleep(3000);

		Assert.assertEquals(buybutton.getText(), "$75.00");

	}

}
