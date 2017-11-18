package com.vans.Classic.AuthenticClassic;

import org.testng.annotations.Test;


import com.vans.Classic.AuthenticClassic.Page.AuthenticClassicPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class AuthenticClassicTest extends VansBaseTest{

	@Test
	public void verifyBaseUrlForAuthentic() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		authentic.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSize();
		authentic.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		
		Thread.sleep(3000);
		authentic.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		AuthenticClassicPage authentic = new AuthenticClassicPage(driver);
		authentic.clickOnAuthenticClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.startover(driver);
	}
}
