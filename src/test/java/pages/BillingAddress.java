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

public class BillingAddress extends CommonMethods {
	
	ExtentTest test;
	
public BillingAddress(ExtentTest test) {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//span[@id='select2-billing_state-container']")
	WebElement District;
	
	@FindBy(xpath = "//span[@title=\"Rajshahi\"]")
	WebElement Rajshahi;
	
	@FindBy(xpath = "//select[@id='billing_area']")
	WebElement area;
	
	@FindBy(xpath = "//option[@value=\"643\"]")
	WebElement RajshahiCity;
	
	@FindBy(xpath = "//textarea[@id='billing_address_1']")
	WebElement FullAddress;
	
	@FindBy(xpath = "//textarea[@id='order_comments']")
	WebElement Comments;
	
	@FindBy(xpath = "//input[@id='shipping_method_0_flat_rate2']")
	WebElement Curier;
	
	@FindBy(xpath = "//input[@id='payment_method_rocket']")
	WebElement payment;
	
	@FindBy(xpath = "//button[@id='place_order']")
	WebElement Confirm;
	

	public void SelectDistrict() throws IOException {
		test.info("select your District");
		try {
			if (District.isDisplayed()) {
				District.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Select District.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "District");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "District.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>District Not Selected.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DistrictA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "DistrictA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(District.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void SelectRajshahiDistrict() throws IOException {
		test.info("select your district Name");
		try {
			if (Rajshahi.isDisplayed()) {
				Rajshahi.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Select Rajshahi District.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Rajshahi");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Rajshahi.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Rajshahi not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RajshahiA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RajshahiA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Rajshahi.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void SelectArea() throws IOException {
		test.info("select your Area");
		try {
			if (area.isDisplayed()) {
				area.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Click Area Section.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "area");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "area.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Area not Clickable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "areaA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "areaA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(area.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void SelectAreaCity() throws IOException {
		test.info("Select your Area City");
		try {
			if (RajshahiCity.isDisplayed()) {
				RajshahiCity.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Select Rajshahi City.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RajshahiCity");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RajshahiCity.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>City not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RajshahiCityA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RajshahiCityA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(RajshahiCity.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void selectAddress() throws IOException {
		test.info("Select your Address");
		try {
			if (FullAddress.isDisplayed()) {
				sendText(FullAddress, "Terokhadia, Senanibus,Rajpara,Rajshahi");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Address Fillup.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FullAddress");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FullAddress.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Address not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FullAddressA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FullAddressA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(FullAddress.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	
	
	public void selectCommentSection() throws IOException {
		test.info("If any Comment For Us");
		try {
			if (Comments.isDisplayed()) {
				sendText(Comments, "Please Do Fast Delivary");
				test.pass("<p style=\"color:green; font-size:13px\"><b>comment fast.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Comments");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Comments.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				timeOut(10000);
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Comment not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CommentsA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CommentsA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Comments.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
//	public void SelectShipping() throws IOException {
//		test.info("Choose your Shipping System");
//		try {
//			if (Curier.isDisplayed()) {
//				Curier.click();
//				test.pass("<p style=\"color:green; font-size:13px\"><b>Choose Shipping.</b></p>");
//				timeOut(2000);
//				@SuppressWarnings("unused")
//				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Curier");
//				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Curier.png";
//				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//			}
//			
//		} catch (Exception e) {
//			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping not locateable.</b></p>");
//			Throwable t = new InterruptedException("Exception");
//			test.fail(t);
//			@SuppressWarnings("unused")
//			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CurierA");
//			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CurierA.png";
//			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//			Assert.assertTrue(Curier.isDisplayed());
//			PageDriver.getCurrentDriver().quit();
//		}
//	}
	
	public void SelectPayment() throws IOException {
		test.info("select Payment Method");
		try {
			if (payment.isDisplayed()) {
				payment.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Select Payment Method.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "payment");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "payment.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Payment Mathod not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "payment");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "payment.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(payment.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void SelectOrder() throws IOException {
		test.info("Select Confirm Your Percess order");
		try {
			if (Confirm.isDisplayed()) {
				Confirm.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Confirm your Order.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Confirm");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Confirm.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>order button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ConfirmA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConfirmA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Confirm.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	

}
