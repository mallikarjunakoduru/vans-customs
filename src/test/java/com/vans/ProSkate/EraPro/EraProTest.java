package com.vans.ProSkate.EraPro;

import org.testng.annotations.Test;

import com.vans.ProSkate.EraPro.Page.EraProPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class EraProTest extends VansBaseTest {
	
	@Test
	public void verifyBaseUrlForEraPro() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		erapro.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		erapro.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		erapro.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		erapro.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		Thread.sleep(3000);
		erapro.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		EraProPage erapro = new EraProPage(driver);
		erapro.clickOnEraPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		erapro.startover(driver);
	}

}
