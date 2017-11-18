package com.vans.Classic.EraClassic;

import org.testng.annotations.Test;

import com.vans.Classic.EraClassic.Page.EraClassicPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class EraClassicTest extends VansBaseTest {
	@Test
	public void verifyBaseUrlForOldSkoolClassic() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		eraclassic.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		eraclassic.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSize();
		eraclassic.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		
		Thread.sleep(3000);
		eraclassic.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		EraClassicPage eraclassic = new EraClassicPage(driver);
		eraclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		eraclassic.startover(driver);
	}

}
