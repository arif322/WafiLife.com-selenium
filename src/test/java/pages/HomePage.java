package pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class HomePage extends CommonMethods {
	
	ExtentTest test;
	
	public HomePage(ExtentTest test) {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		
//	@FindBy(id = "reg_billing_first_name"),
	@FindBy(xpath = "//a[@title='আমার অ্যাকাউন্ট']")
	
	})
	
	WebElement SignIn;
	
	
	@FindAll({
		
	@FindBy(id = "reg_billing_first_name"),
	@FindBy(xpath = "//input[@id='reg_billing_first_name']")
	
	})
	
	WebElement FullName;
	
	@FindAll({
		
	@FindBy(id = "reg_billing_phone"),
	@FindBy(xpath = "//input[@name='billing_phone']")
	
	})
	WebElement PhoneNumber;
	
	@FindAll({
		@FindBy(id = "reg_email"),
		@FindBy(xpath = "//input[@name='email']")
	})
	
	WebElement EmailRag;
	
	@FindAll({
		@FindBy(id = "reg_password")
		
	})
	WebElement PassWordReg;
	
	@FindAll({
		@FindBy(id = "reg_confirm_password"),
		@FindBy(xpath = "//input[@name='confirm_password']"),
		
	})
	
	WebElement PasswordConfirm;
	
	@FindAll({
		@FindBy(xpath = "//input[@name='register']")
	})
	WebElement RegisterButton;
	
	 public void ClickOnAccount() throws IOException {
		test.info("Click on SignIn Button");
		try {

			if(SignIn.isDisplayed()){
				SignIn.click();
				timeOut(2000);
				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign-in Accurated</b></p>");
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"SignIn");
				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "SignIn.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
				Assert.assertTrue(SignIn.isDisplayed());

			}
		}

		catch (Exception e){

			test.fail("<p style=\"color:red; font-size:20px\"><b>Sign-in Location not Available</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			timeOut();
		    @SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"SignInA");
			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "SignInA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(SignIn.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			timeOut(2000);

		}
		
		
	}
	 
	public void NameButton() throws IOException {
		test.info("Fill up Name Section");
		try {

			if(FullName.isDisplayed()){
				sendText(FullName, firstNameGenerate());
				timeOut(2000);
				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign-in Accurated</b></p>");
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"FullName");
				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "FullName.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
				Assert.assertTrue(FullName.isDisplayed());

			}
		}

		catch (Exception e){

			test.fail("<p style=\"color:red; font-size:20px\"><b>Sign-in Location not Available</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			timeOut();
		    @SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"FullNameS");
			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "FullNameS.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(FullName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			timeOut(2000);

		}
	} 
	
	public void PhoneNumberCreate() throws IOException {
		test.info("Phone number create");
		try {

			if(PhoneNumber.isDisplayed()){
				sendText(PhoneNumber, phoneNumberGenerate());
				timeOut(2000);
				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign-in Accurated</b></p>");
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"PhoneNumber");
				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "PhoneNumber.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
				Assert.assertTrue(FullName.isDisplayed());

			}
		}

		catch (Exception e){

			test.fail("<p style=\"color:red; font-size:20px\"><b>Sign-in Location not Available</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			timeOut();
		    @SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"PhoneNumberA");
			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "PhoneNumberA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(PhoneNumber.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			timeOut(2000);

		}
		
	}
	
	public void EmailRegistration() throws IOException {
		test.info("Provide your email Address");
		try {

			if(EmailRag.isDisplayed()){
				sendText(EmailRag, emailGenerate());
				timeOut(2000);
				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign-in Accurated</b></p>");
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"EmailRag");
				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "EmailRag.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
				Assert.assertTrue(EmailRag.isDisplayed());

			}
		}

		catch (Exception e){

			test.fail("<p style=\"color:red; font-size:20px\"><b>Sign-in Location not Available</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			timeOut();
		    @SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"EmailRagA");
			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "EmailRagA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(EmailRag.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			timeOut(2000);

		}
		
		
	}
	
	public void CreatePassword() throws IOException {
		test.info("provide your persional Password");
		try {

			if(PassWordReg.isDisplayed()){
				sendText(PassWordReg, passwordGenerate());
				timeOut(2000);
				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign-in Accurated</b></p>");
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"PassWordReg");
				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "PassWordReg.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
				Assert.assertTrue(PassWordReg.isDisplayed());

			}
		}

		catch (Exception e){

			test.fail("<p style=\"color:red; font-size:20px\"><b>Sign-in Location not Available</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			timeOut();
		    @SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"PassWordRegA");
			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "PassWordRegA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(PassWordReg.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			timeOut(2000);

		}
		
	}
	
	public void ConfirmPassword() throws IOException {
		test.info("Confirm your password");
		try {

			if(PasswordConfirm.isDisplayed()){
				sendText(PasswordConfirm, passwordGenerate());
				timeOut(2000);
				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign-in Accurated</b></p>");
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"PasswordConfirm");
				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "PasswordConfirm.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
				Assert.assertTrue(PasswordConfirm.isDisplayed());

			}
		}

		catch (Exception e){

			test.fail("<p style=\"color:red; font-size:20px\"><b>Sign-in Location not Available</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			timeOut();
		    @SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"PasswordConfirmA");
			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "PasswordConfirmA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(PasswordConfirm.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			timeOut(2000);

		}
		
	}
	
	public void ClickRegButton() throws IOException {
		test.info("Confirm your registration");
		try {
			if (RegisterButton.isDisplayed()) {
				RegisterButton.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Account Button Clicked.</b></p>");
				timeOut(10000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "accountButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "accountButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Account Button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "accountButton");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "accountButton.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(RegisterButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
	}
	
}
