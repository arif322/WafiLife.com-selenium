package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class PreOrder extends CommonMethods{
	ExtentTest test;
	public  PreOrder(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//button[contains(text(),'প্রি-অর্ডার করুন')]")
	WebElement OrderBook;
	
	@FindBy(xpath = "//body/div[@id='extra-add-product-popup']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[2]")
	WebElement OrderCollect;
	
	public void PreOrderSelect() throws IOException {
		test.info("Click on Authors Button");
		try {
			if (OrderBook.isDisplayed()) {
				OrderBook.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Pre order Confirm.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderBook");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderBook.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>pre Order Not Insert.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderBookA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderBookA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(OrderBook.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void ConfirmOrder() throws IOException {
		test.info("Click on Authors Button");
		try {
			if (OrderCollect.isDisplayed()) {
				OrderCollect.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>order Confirm.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderCollect");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderCollect.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Order Not Insert.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderCollectA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderCollectA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(OrderCollect.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	


}
