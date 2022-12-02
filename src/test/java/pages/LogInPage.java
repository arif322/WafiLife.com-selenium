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

public class LogInPage extends CommonMethods {
	
	ExtentTest test;
	
	public LogInPage(ExtentTest test) {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement UserName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement InputPassword;

	@FindBy(xpath = "//input[@name='login']")

    WebElement Login;

	public void clickNameButton() throws IOException {
		test.info("Fill Up User Name");
		try {
			if (UserName.isDisplayed()) {
				sendText(UserName, "arifshumon.ewu@gmail.com");
				test.pass("<p style=\"color:green; font-size:13px\"><b>User Name Passed.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserName");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserName.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		
	} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>User Name Not Found.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserNameA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserNameA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(UserName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void InputPasswordButton() throws IOException {
		test.info("Fill Up valid Password");
		try {
			if (InputPassword.isDisplayed()) {
				InputPassword.click();
				sendText(InputPassword, "arif1234");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Correct Password.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "InputPassword");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "InputPassword.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		
	} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Invalid Password.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "InputPasswordA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "InputPasswordA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(InputPassword.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void clickOnLogInButton() throws IOException {
		test.info("Click on LogIn Button");
		try {
			if (Login.isDisplayed()) {
				Login.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>LogIn Successfully.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Login.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		
	} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>UserName or Password Not Varified.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LoginA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LoginA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Login.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	

}
