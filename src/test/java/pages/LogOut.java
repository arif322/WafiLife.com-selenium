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

public class LogOut extends CommonMethods {
	ExtentTest test; 
	
	public LogOut(ExtentTest test) {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//a[contains(text(),'লগ অউট করুন')]")
	WebElement LogOutPage;
	
	public void clickOnLogOutButton() throws IOException {
		test.info("Click on Account Button");
		try {
			if (LogOutPage.isDisplayed()) {
				hover(LogOutPage);
				LogOutPage.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Account Button Clicked.</b></p>");
				timeOut(10000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LogOutPage");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LogOutPage.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Account Button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LogOutPageA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LogOutPageA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(LogOutPage.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(2000);
	}

}
