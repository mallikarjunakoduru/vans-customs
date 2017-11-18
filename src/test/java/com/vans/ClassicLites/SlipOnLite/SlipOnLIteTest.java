package com.vans.ClassicLites.SlipOnLite;

import org.testng.annotations.Test;

import com.vans.ClassicLites.SlipOnLite.Page.SlipOnLitePage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class SlipOnLIteTest extends VansBaseTest {
	@Test
	public void verifyBaseurlForSk8HiMte() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		sliponlite.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsUpcharge() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sliponlite.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		sliponlite.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		sliponlite.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		Thread.sleep(3000);
		sliponlite.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		SlipOnLitePage sliponlite = new SlipOnLitePage(driver);
		sliponlite.clickOnSliponlite(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sliponlite.startover(driver);
	}

}
