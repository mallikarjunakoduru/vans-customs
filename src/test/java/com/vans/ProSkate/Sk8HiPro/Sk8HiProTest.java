package com.vans.ProSkate.Sk8HiPro;

import org.testng.annotations.Test;

import com.vans.ProSkate.Sk8HiPro.Page.Sk8HiProPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class Sk8HiProTest extends VansBaseTest {
	
	
	
	@Test
	public void verifyBaseUrlForSk8HiPro() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		sk8hipro.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sk8hipro.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		sk8hipro.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		sk8hipro.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		Thread.sleep(3000);
		sk8hipro.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);
	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);
	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		Sk8HiProPage sk8hipro = new Sk8HiProPage(driver);
		sk8hipro.clickOnSk8HiPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sk8hipro.startover(driver);
	}
}
