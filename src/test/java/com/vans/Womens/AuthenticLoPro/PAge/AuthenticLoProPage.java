package com.vans.Womens.AuthenticLoPro.PAge;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vans.core.VansBasePage;

public class AuthenticLoProPage extends VansBasePage {

	public AuthenticLoProPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[@class='selector-style-name'][text()='Authentic lo pro']")
	WebElement authenticlopro;
	
	@FindBy(xpath = "//a[@href='customs-womens.html'][text()='Womens']")
	WebElement womenstab;

	public void clickOnAuthenticClassic() throws InterruptedException {
		womenstab.click();
		Thread.sleep(2000);
		authenticlopro.click();
		Thread.sleep(5000);

	}

	public void getBaseURl(WebDriver driver) {
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl,
				"https://www.vans.com/customizer.authentic-lo-pro.html?recipe=b36b32b2d834eb8098db7df6d23c495d");

	}

	public void clickOnAddToCart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtocart);
		Thread.sleep(2000);
		switchwindow(driver);
		Assert.assertEquals(minicartitemname.getText(), "WOMENS CUSTOM AUTHENTIC LO PRO PT");

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
			String[] strs = { "QUARTERS", "TONGUE", "EYELETS", "BINDING", "FOXING", "FOXING STRIPE", "LACES" };

			Assert.assertEquals(strs[count], flyoutvisibletext.getText());
			count++;

		}

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
