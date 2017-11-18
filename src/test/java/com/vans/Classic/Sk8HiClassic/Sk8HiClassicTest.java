package com.vans.Classic.Sk8HiClassic;

import org.testng.annotations.Test;

import com.vans.Classic.Sk8HiClassic.Page.Sk8HiClassicPage;
import com.vans.core.VansBasePage;
import com.vans.core.VansBaseTest;

public class Sk8HiClassicTest extends VansBaseTest {
	

	
	@Test
	public void verifyBaseUrlForAuthentic() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		sk8hiclassic.getBaseURl(driver);
	}
	
	@Test
	public void verifyMaterialsupcharge() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sk8hiclassic.upcgargematerial();

	}

	
	@Test
	public void verifyClickOnBuyButton() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.selectSize();
		sk8hiclassic.clickOnAddToCart(driver);

	}

	@Test
	public void addToWishList() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.addToWishList(driver);

	}

	@Test
	public void verifyAllSizesPresent() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.SizeDropdownVerification();

	}

	@Test
	public void verifyAllQtyPresent() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		basepage.buyButtonClick(driver);
		basepage.qtyDropDownVerification();

	}

	@Test
	public void verifyAllflyOutMenuOptions() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		
		Thread.sleep(3000);
		sk8hiclassic.flyoutmenu(driver);

	}

	@Test
	public void verifyEmailShareButton() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.emailshare(driver);

	}
	
	
	@Test
	public void verifySharelinkButton() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		Thread.sleep(3000);
		basepage.sharecopylink(driver);

	}

	
	
	@Test
	public void verifyStartOver() throws InterruptedException {
		Sk8HiClassicPage sk8hiclassic = new Sk8HiClassicPage(driver);
		sk8hiclassic.clickOnSk8HiClassic();
		VansBasePage basepage=new VansBasePage(driver);
		basepage.materialstab(driver);
		basepage.selectmaterialswatch(driver);
		sk8hiclassic.startover(driver);
	}
	
}
