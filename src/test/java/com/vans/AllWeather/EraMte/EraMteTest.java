package com.vans.AllWeather.EraMte;

import org.testng.annotations.Test;

import com.vans.AllWeather.EraMte.Page.EraMtePage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class EraMteTest extends VansBaseTest {
	
	@Test
	public void verifyBaseurlForSk8HiMte() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		eramte.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsUpcharge() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		Thread.sleep(2000);
		eramte.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		eramte.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.buyButtonClick(driver);
		Thread.sleep(2000);
		eramte.SizeDropdownVerification();
	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		Thread.sleep(3000);
		eramte.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);
	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		EraMtePage eramte = new EraMtePage(driver);
		eramte.clickOneramte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		eramte.startover(driver);
	}

}



