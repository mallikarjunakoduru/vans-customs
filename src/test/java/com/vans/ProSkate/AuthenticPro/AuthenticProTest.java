package com.vans.ProSkate.AuthenticPro;

import org.testng.annotations.Test;

import com.vans.ProSkate.AuthenticPro.Page.AuthenticProPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class AuthenticProTest  extends VansBaseTest{
	@Test
	public void verifybaseurlforauthenticpro() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		authenticpro.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		authenticpro.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		authenticpro.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		authenticpro.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		Thread.sleep(3000);
		authenticpro.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		AuthenticProPage authenticpro = new AuthenticProPage(driver);
		authenticpro.clickOnAuthenticPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		authenticpro.startover(driver);
	}

}
