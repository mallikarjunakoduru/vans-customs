package com.vans.core;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class VansBasePage {
	@FindBy(xpath = "html/body/div[2]/section/div/div[3]/div[2]/div[6]/div[2]/ul/li[3]/a")
	WebElement Materialstab;

	@FindBy(xpath = "//div [@style='background-image: url(\"/vfdp-customs-prod/images/swatch_ui/mat_suede_racing_red.jpg\");']")
	WebElement racingred;

	@FindBy(xpath = "//span[@class='configurator2-header-buy-button-price']")
	public
	WebElement buybutton;

	@FindBy(xpath = "//select[@class='configurator2-size1 configurator2-size']")
	protected
	WebElement sizedropdown;

	@FindBy(xpath = "//option[@value='7.5 Women']")
	WebElement Women7_5;

	@FindBy(xpath = "//a[@class='configurator2-buymenu-addcart details-button button configurator2-btn-addtocart']")
	protected
	WebElement addtocart;

	@FindBy(xpath = "//div[@class='configurator2-header-icon-text'][text()='FAVORITE']")
	WebElement addtowishlist;

	@FindBy(xpath = "//select[@class='configurator2-qty1 configurator2-qty']")
	WebElement qtydropdown;

	@FindBy(xpath = "//div[@id='jride-id-ui-steps-nav'][@class='configurator2-footer-ui-steps-btn configurator2-footer-ui-steps-flyout-btn']//span[@class='icon-menu']")
	WebElement flyoutmenu;

	@FindBy(xpath = "//div[@class='configurator2-footer-ui-steps-btn configurator2-footer-ui-steps-next-component']")
	protected
	WebElement flyoutnext;

	@FindBy(xpath = "//div[@class='configurator2-footer-ui-steps-labels']")
	WebElement flyoutvisibletextwithnumbers;

	@FindBy(xpath = "//h2[@class='configurator2-footer-ui-component-name']")
	protected
	WebElement flyoutvisibletext;

	@FindBy(xpath = "//div[@class='vfrs-dialog-text-js']")
	WebElement addtowishlistpopup;

	@FindBy(xpath = "//a[@class='mini-cart-item-name-text']")
	protected
	WebElement minicartitemname;

	@FindBy(xpath = "//div[@class='configurator2-header-option configurator2-header-share']")
	WebElement sharebutton;

	@FindBy(xpath = "//a[@class='share-email-trigger']")
	WebElement socialiconmail;

	@FindBy(xpath = "//a[@class='link-share-trigger']")
	WebElement socialiconshare;

	@FindBy(xpath = "//input[@class='input-box-email-share']")
	WebElement inputboxemailshare;

	@FindBy(xpath = "//button[@class='button primary email-share-send']")
	WebElement emailsharesendbutton;

	@FindBy(xpath = "//div[@class='content']")
	WebElement sharepage;
	
	@FindBy(xpath = "//div[@class='configurator2-header-icon-text'][text()='START OVER']")
	public
	WebElement startoverbutton;
	
	@FindBy(xpath = "//button[@class='button primary configurator2-replace-current-design-save'][text()='YES, START OVER']")
	public
	WebElement yesstartoverbutton;
	
	
	
	@FindBy(xpath = "//li[@class='foxing_stripe'][@data-component-name='foxing_stripe'][@data-component-position='7']")
	WebElement foxingstripe;
	
	@FindBy(xpath = "//li[@class='foxing'][@data-component-name='foxing'][@data-component-position='6']")
	WebElement foxing;
	
	@FindBy(xpath = "//li[@class='collar_lining'][@data-component-name='collar_lining'][@data-component-position='5']")
	WebElement collarlining;
	
	
	@FindBy(xpath = "//li[@class='binding'][@data-component-name='binding'][@data-component-position='4']")
	WebElement binding;
	
	
	@FindBy(xpath = "//li[@class='heel_counter'][@data-component-name='heel_counter'][@data-component-position='3']")
	WebElement heelcounter;
	
	
	
	@FindBy(xpath = "//li[@class='quarters'][@data-component-name='quarters'][@data-component-position='2']")
	WebElement quarters;
	
	
	
	@FindBy(xpath = "//li[@class='vamp'][@data-component-name='vamp'][@data-component-position='1']//div[@class='list-configurator-bullet']")
	WebElement vamps;
	
	@FindBy(xpath = "//option[@value='8.5 Men'][text()='8.5 Men']")
	WebElement men8_5 ;
	
	
	@FindBy(xpath = "//div[@style='background-image: url(\"/vfdp-customs-prod/images/swatch_ui/mat_suede_black.jpg\");']")
	WebElement waterrepellentblack ;
	
	
	
	
	
	
	




	public VansBasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void upcgargematerial() {
		String actualtext = buybutton.getText();
		String expectedtext = "$85.00";
		Assert.assertEquals(actualtext, expectedtext);

	}

	public void materialstab(WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", Materialstab);
		Thread.sleep(2000);

	}

	public void selectmaterialswatch(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", racingred);
		Thread.sleep(2000);

	}
	

	

	public void buyButtonClick(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", buybutton);
		Thread.sleep(2000);

	}

	public void clickOnSizeDropDown(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", sizedropdown);
		Thread.sleep(2000);

	}

	public void selectSize() throws InterruptedException {
		Women7_5.click();
		Thread.sleep(2000);

	}
	
	public void selectSizeforPros() throws InterruptedException {
		men8_5.click();
		Thread.sleep(2000);

	}

	public void selectQty() {

	}

	public void clickOnAddToCart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtocart);
		Thread.sleep(2000);
		switchwindow(driver);
		Assert.assertEquals(minicartitemname.getText(), "WOMENS CUSTOM SLIP-ON L");

	}

	public void addToWishList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", addtowishlist);
		Thread.sleep(3000);
		switchwindow(driver);
		Assert.assertEquals(addtowishlistpopup.getText(),
				"You have successfully added your Customs design to your Favorites");

	}

	public void qtyDropDownVerification() {
		// TODO Auto-generated method stub
		Select select = new Select(qtydropdown);
		List<WebElement> options = select.getOptions();
		int count = 0;
		for (WebElement we : options) {
			count++;
			System.out.println(we.getText());
		}
		Assert.assertEquals(count, 5);
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
		Assert.assertEquals(count, 38);

	}



	public void emailshare(WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", sharebutton);

		Thread.sleep(5000);

		switchwindow(driver);
		socialiconmail.click();
		Thread.sleep(3000);
		inputboxemailshare.sendKeys("mkoduru@rauxa.com");
		emailsharesendbutton.click();
		Assert.assertEquals(sharepage.getText(), "EMAIL SEND");
	}

	public void switchwindow(WebDriver driver) {
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window

		// Now you are in the popup window, perform necessary actions here

		// driver.switchTo().window(parentWindowHandler);
	}

	public void sharecopylink(WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", sharebutton);

		Thread.sleep(5000);

		switchwindow(driver);
		
		Thread.sleep(2000);
		socialiconshare.click();
		Thread.sleep(3000);

		Assert.assertEquals(sharepage.getText(), "Custom link has been copied. Paste away!");
	}

	


	public void startover(WebDriver driver) throws InterruptedException {
		startoverbutton.click();
		Thread.sleep(2000);
		System.out.println(yesstartoverbutton.isDisplayed());
	
		yesstartoverbutton.click();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(buybutton.getText(), "$75.00");
		
		
		
	}

	public void selectmaterialswatchformte(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", waterrepellentblack);
		Thread.sleep(2000);
	}
}

	

	
	


