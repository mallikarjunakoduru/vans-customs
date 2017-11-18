package com.vans.ProSkate.ChimaPro;

import org.testng.annotations.Test;

import com.vans.ProSkate.ChimaPro.Page.ChimaProPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class ChimaProTest extends VansBaseTest {
	
	@Test
	public void verifyBaseUrlForEraPro() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		chimapro.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		chimapro.upcgargematerial();
	}
	

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
	}

	@Test
	public void addToCart() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		chimapro.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		chimapro.SizeDropdownVerification();
	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		Thread.sleep(3000);
		chimapro.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		ChimaProPage chimapro = new ChimaProPage(driver);
		chimapro.clickOnChimaPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		chimapro.startover(driver);
	}

}
