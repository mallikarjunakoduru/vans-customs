package com.vans.ClassicLites.AuthenticLite;

import org.testng.annotations.Test;

import com.vans.ClassicLites.AuthenticLite.Page.AuthenticLitePage;
import com.vans.ClassicLites.SlipOnLite.Page.SlipOnLitePage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class AuthenticLiteTest extends VansBaseTest {

	
	@Test
	public void verifyBaseurl() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		authenticlite.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsUpcharge() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		authenticlite.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver); 
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		authenticlite.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		authenticlite.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		Thread.sleep(3000);
		authenticlite.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		AuthenticLitePage authenticlite = new AuthenticLitePage(driver);
		authenticlite.clickOnauthentic(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		authenticlite.startover(driver);
	}
}
