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

public class HomeBooks extends CommonMethods {
	
	ExtentTest test;
	
	public  HomeBooks(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//span[contains(text(),'লেখক')]")
	WebElement Writters;
	
	@FindBy(xpath = "//h3[contains(text(),'Abdulla Yusuf Ali')]")
	WebElement AuthorABdullah;
	
	@FindBy(xpath = "//h3[contains(text(),'Abul Hossain')]")
	WebElement AuthorAbul;
	
	@FindBy(xpath = "//h3[contains(text(),'Abdul Malek')]")
	WebElement AuthorMalik;
	
	@FindBy(xpath = "//h3[contains(text(),'প্রয়োজনীয় লিংক')]")
	WebElement RequiredLinks;
	
	@FindAll({
		@FindBy(xpath = "//span[contains(text(),'বইমেলা ২০২২')]")
	})
	
	WebElement nextPage;
	
	
	
	
	public void AuthorsSelect() throws IOException {
		test.info("Click on Authors Button");
		try {
			if (Writters.isDisplayed()) {
				Writters.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Author Button Clicked.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Writters");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Writters.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Author Button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WrittersA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WrittersA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Writters.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void ViewAuthors() throws IOException {
		test.info("scroll Down Author page");
		try {
			if (AuthorABdullah.isDisplayed()) {
				scrollToElement(AuthorABdullah);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Scroll Author List.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AuthorABdullah");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorABdullah.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Author List not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AuthorABdullahA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorABdullahA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(AuthorABdullah.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void viewAuthors2() throws IOException {
		test.info("scroll Down Author page");
		try {
			if (AuthorAbul.isDisplayed()) {
				scrollToElement(AuthorAbul);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Scroll Author List.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AuthorAbul");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorAbul.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Author List 2nd time not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AuthorAbul");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorAbulA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(AuthorAbul.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void viewAuthor3() throws IOException {
		test.info("scroll Down Author page");
		try {
			if (AuthorMalik.isDisplayed()) {
				scrollToElement(AuthorMalik);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Author list Scroll.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AuthorMalik");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorMalik.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Author not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AuthorMalikA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AuthorMalikA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(AuthorMalik.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void viewAuthor4() throws IOException {
		test.info("scroll Down Author page");
		try {
			if (RequiredLinks.isDisplayed()) {
				scrollToElement(RequiredLinks);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Author List 3rd time Scroll.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RequiredLinks");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RequiredLinks.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Again author not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RequiredLinksA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RequiredLinksA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(RequiredLinks.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void ScrollUpTOAuthor() throws IOException {
		test.info("scroll Down Author page");
		try {
			if (RequiredLinks.isDisplayed()) {
				scrollToElement(RequiredLinks);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Scroll bottom to Up.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RequiredLinks");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RequiredLinks.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>ScrollUp not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RequiredLinksA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RequiredLinksA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(RequiredLinks.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void selectNextPage() throws IOException {
		test.info("Click on Account Button");
		try {
			if (nextPage.isDisplayed()) {
				nextPage.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Go to Next Page.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nextPage");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nextPage.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Next Page not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "nextPageA");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "nextPageA.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(nextPage.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	
	
	

}
