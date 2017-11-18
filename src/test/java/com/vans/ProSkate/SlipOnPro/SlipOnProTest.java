package com.vans.ProSkate.SlipOnPro;

import org.testng.annotations.Test;

import com.vans.ProSkate.SlipOnPro.Page.SlipOnProPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class SlipOnProTest extends VansBaseTest {
	@Test
	public void verifyBaseUrlForSk8HiPro() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		sliponpro.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sliponpro.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		sliponpro.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		sliponpro.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		Thread.sleep(3000);
		sliponpro.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		SlipOnProPage sliponpro = new SlipOnProPage(driver);
		sliponpro.clickOnSlipOnPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sliponpro.startover(driver);
	}

}
