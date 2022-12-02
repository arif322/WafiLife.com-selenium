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

public class AuthorBooks extends CommonMethods {
	
	ExtentTest test;
	
	public  AuthorBooks(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	
	@FindBy( xpath = "//span[contains(text(),'প্রি-অর্ডার')]")
	WebElement AuthorCat;
	
	@FindAll({
	@FindBy(xpath  = "//a[contains(text(),'এসো জীবনকে পরিবর্তন করি')]")
	})
	WebElement LifeLineBooks;
	
	public void BookClick() throws IOException {
		test.info("view all books");
		try {

			if(AuthorCat.isDisplayed()){
				AuthorCat.click();
				timeOut(2000);
				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Select pre Order</b></p>");
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"AuthorCat");
				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "AuthorCat.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
				Assert.assertTrue(AuthorCat.isDisplayed());
				timeOut();

			}
		}

		catch (Exception e){

			test.fail("<p style=\"color:red; font-size:20px\"><b>Order not Available</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			timeOut();
		    @SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"AuthorCatA");
			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "AuthorCatA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(AuthorCat.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			timeOut(2000);

		}
	}
	
	public void viewAnyBookDetails() throws IOException {
		test.info("Book Details");
		try {
			if (LifeLineBooks.isDisplayed()) {
				LifeLineBooks.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Books Details viewed.</b></p>");
				timeOut(10000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LifeLineBooks");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LifeLineBooks.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Book Details not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LifeLineBooksA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LifeLineBooksA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(LifeLineBooks.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}

	
//	public void BuyBook() throws IOException {
//		test.info("view all books");
//		try {
//
//			if(LifeLineBooks.isDisplayed()){
//				LifeLineBooks.click();
//				
//				
//				timeOut(2000);
//				test.pass("<p style=\"color:DarkBlue; font-size:20px\"><b>Select Authors Name</b></p>");
//				@SuppressWarnings("unused")
//				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"Books");
//				String dest = System.getProperty("user.dir") +"\\screenshots\\" + "Books.png";
//				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
//				Assert.assertTrue(LifeLineBooks.isDisplayed());
//
//			}
//		}
//
//		catch (Exception e){
//
//			test.fail("<p style=\"color:red; font-size:20px\"><b>Authors not Available</b></p>");
//			Throwable t = new InterruptedException("Exception");
//			test.fail(t);
//			timeOut();
//		    @SuppressWarnings("unused")
//			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),"LifeLineBooksA");
//			String dest = System.getProperty("user.dir") +"\\screenshots\\" + "LifeLineBooksA.png";
//			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//			Assert.assertTrue(LifeLineBooks.isDisplayed());
//			PageDriver.getCurrentDriver().quit();
//			timeOut(2000);
//
//		}
//	}

}
