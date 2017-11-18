package com.vans.ProSkate.OldSkoolPro;

import org.testng.annotations.Test;

import com.vans.ProSkate.OldSkoolPro.Page.OldSkoolProPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class OldSkoolProTest extends VansBaseTest {
	
	
	@Test
	public void verifyBaseUrlForSk8HiPro() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		oldskoolpro.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		oldskoolpro.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSizeforPros();
		oldskoolpro.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		oldskoolpro.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		Thread.sleep(3000);
		oldskoolpro.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
		
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	@Test
	public void verifyStartOver() throws InterruptedException {
		OldSkoolProPage oldskoolpro = new OldSkoolProPage(driver);
		oldskoolpro.clickOnOldSkoolPro(driver);
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		oldskoolpro.startover(driver);
	}

}
