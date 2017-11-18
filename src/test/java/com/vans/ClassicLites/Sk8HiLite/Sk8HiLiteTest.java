package com.vans.ClassicLites.Sk8HiLite;

import org.testng.annotations.Test;

import com.vans.ClassicLites.Sk8HiLite.Page.Sk8HiLitePage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class Sk8HiLiteTest  extends VansBaseTest{
	@Test
	public void verifyBaseurl() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		sk8hilite.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsUpcharge() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sk8hilite.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		sk8hilite.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		sk8hilite.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		Thread.sleep(3000);
		sk8hilite.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		Sk8HiLitePage sk8hilite = new Sk8HiLitePage(driver);
		sk8hilite.clickOnSk8HiLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sk8hilite.startover(driver);
	}

}
