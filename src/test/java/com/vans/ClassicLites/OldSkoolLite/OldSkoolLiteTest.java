package com.vans.ClassicLites.OldSkoolLite;

import org.testng.annotations.Test;

import com.vans.ClassicLites.OldSkoolLite.Page.OldSkoolLitePage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class OldSkoolLiteTest extends VansBaseTest {

	
	@Test
	public void verifyBaseurl() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		oldskoollite.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsUpcharge() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		oldskoollite.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		oldskoollite.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		oldskoollite.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		Thread.sleep(3000);
		oldskoollite.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		OldSkoolLitePage oldskoollite = new OldSkoolLitePage(driver);
		oldskoollite.clickOnOldSkoolLite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		oldskoollite.startover(driver);
	}
}
