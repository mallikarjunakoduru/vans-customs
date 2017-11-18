package com.vans.Classic.ClassicSlipOn;

import org.testng.annotations.Test;

import com.vans.Classic.ClassicSlipOn.Page.ClassicSlipOnPage;
import com.vans.core.VansBaseTest;

public class ClassicSlipOnTest  extends VansBaseTest{
	@Test
	public void verifyClassicSlipOnUrl() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.classicSlipOnUrlVerify(driver);

	}

	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);

		sliponClassic.clickOnClassicSlipOn();
		sliponClassic.materialstab(driver);
		sliponClassic.selectmaterialswatch(driver);
		sliponClassic.upcgargematerial();

	}

	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		sliponClassic.materialstab(driver);
		sliponClassic.selectmaterialswatch(driver);
		sliponClassic.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		Thread.sleep(3000);
		sliponClassic.materialstab(driver);
		sliponClassic.selectmaterialswatch(driver);
		sliponClassic.buyButtonClick(driver);
		sliponClassic.selectSize();
		sliponClassic.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		sliponClassic.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		sliponClassic.materialstab(driver);
		sliponClassic.selectmaterialswatch(driver);
		sliponClassic.buyButtonClick(driver);
		sliponClassic.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		sliponClassic.materialstab(driver);
		sliponClassic.selectmaterialswatch(driver);
		sliponClassic.buyButtonClick(driver);
		sliponClassic.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		Thread.sleep(3000);
		sliponClassic.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		Thread.sleep(3000);
		sliponClassic.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		Thread.sleep(3000);
		sliponClassic.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		ClassicSlipOnPage sliponClassic = new ClassicSlipOnPage(driver);
		sliponClassic.clickOnClassicSlipOn();
		sliponClassic.materialstab(driver);
		sliponClassic.selectmaterialswatch(driver);
		sliponClassic.startover(driver);
	}

}
