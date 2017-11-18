package com.vans.AllWeather.Sk8HiMte;

import org.testng.annotations.Test;

import com.vans.AllWeather.Sk8HiMte.Page.Sk8HiMtePage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class Sk8HiMteTest extends VansBaseTest{
	
	@Test
	public void verifyBaseurlForSk8HiMte() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		sk8himte.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsUpcharge() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		sk8himte.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		sk8himte.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
	
		
		VansBasePage basepage=new VansBasePage(driver);
		basepage.switchwindow(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		basepage.buyButtonClick(driver);
		sk8himte.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		Thread.sleep(3000);
		sk8himte.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		Sk8HiMtePage sk8himte = new Sk8HiMtePage(driver);
		sk8himte.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		sk8himte.startover(driver);
	}

}
