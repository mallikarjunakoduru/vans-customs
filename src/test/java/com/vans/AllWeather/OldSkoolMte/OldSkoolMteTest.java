package com.vans.AllWeather.OldSkoolMte;

import org.testng.annotations.Test;

import com.vans.AllWeather.OldSkoolMte.Page.OldSkoolMtePage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class OldSkoolMteTest extends VansBaseTest {
	
	
	@Test
	public void verifyBaseurlForSk8HiMte() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		oldskoolmte.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsUpcharge() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		oldskoolmte.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver); 

		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
	
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		Thread.sleep(2000);
		oldskoolmte.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.buyButtonClick(driver);
		oldskoolmte.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		Thread.sleep(3000);
		oldskoolmte.flyoutmenu(driver);
	}

	
	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		OldSkoolMtePage oldskoolmte = new OldSkoolMtePage(driver);
		oldskoolmte.clickOnoldskoolmte(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatchformte(driver);
		oldskoolmte.startover(driver);
	}

}
