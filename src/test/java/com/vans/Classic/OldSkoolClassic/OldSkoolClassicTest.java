package com.vans.Classic.OldSkoolClassic;

import org.testng.annotations.Test;

import com.vans.Classic.OldSkoolClassic.Page.OldSkoolClassicPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class OldSkoolClassicTest extends VansBaseTest {
	@Test
	public void verifyBaseUrlForOldSkoolClassic() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		oldskoolclassic.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		oldskoolclassic.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSize();
		oldskoolclassic.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		
		Thread.sleep(3000);
		oldskoolclassic.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		OldSkoolClassicPage oldskoolclassic = new OldSkoolClassicPage(driver);
		oldskoolclassic.clickOnOldSkoolClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		oldskoolclassic.startover(driver);
	}


}
