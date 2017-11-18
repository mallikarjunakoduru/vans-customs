package com.vans.Womens.AuthenticLoPro;

import org.testng.annotations.Test;

import com.vans.Womens.AuthenticLoPro.PAge.AuthenticLoProPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class AuthenticLoProTest  extends VansBaseTest{
	
	
	@Test
	public void verifyBaseUrlForAuthenticLoPro() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		authenticlopro.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSize();
		authenticlopro.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		authenticlopro.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		
		Thread.sleep(3000);
		authenticlopro.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		AuthenticLoProPage authenticlopro = new AuthenticLoProPage(driver);
		authenticlopro.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.startover(driver);
	}

}
