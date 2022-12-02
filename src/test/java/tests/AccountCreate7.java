package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import drivers.BaseDrivers;
import drivers.PageDriver;
import pages.BillingAddress;
import pages.HomePage;
import utilities.ExtentFactory;

public class AccountCreate7 extends BaseDrivers {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl () {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Order Page</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	@Test (priority = 0)
	public void SelectDistrict() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>District Selected"
				+ "</b></p>");
		
		BillingAddress DistrictPage = new BillingAddress(childTest);
		DistrictPage.SelectDistrict();
			
	}
	
	
	@Test (priority = 1)
	public void DisRajAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b> Selected District Rajshahi."
				+ "</b></p>");
		
		BillingAddress DistRajPage = new BillingAddress(childTest);
		DistRajPage.SelectRajshahiDistrict();
			
	}
	
	@Test (priority = 2)
	public void AreaAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Select Area."
				+ "</b></p>");
		
		BillingAddress AreaPage = new BillingAddress(childTest);
		AreaPage.SelectArea();
			
	}
	
	@Test (priority = 3)
	public void AreaNameAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Select Rajshahi City Area"
				+ "</b></p>");
		
		BillingAddress AreaNamePage = new BillingAddress(childTest);
		AreaNamePage.SelectAreaCity();
			
	}
	
	@Test (priority = 4)
	public void AddressAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Fill Up Address Section"
				+ "</b></p>");
		
		BillingAddress homePage = new BillingAddress(childTest);
		homePage.selectAddress();
			
	}
	
	@Test (priority = 5)
	public void CommentAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>If you Have Any Comment For Us"
				+ "</b></p>");
		
		BillingAddress CommentPage = new BillingAddress(childTest);
		CommentPage.selectCommentSection();
			
	}
	
//	@Test (priority = 6)
//	public void ShippingSysyemAccount() throws IOException {
//		
//		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  sign In"
//				+ "</b></p>");
//		
//		BillingAddress ShippingPage = new BillingAddress(childTest);
//		ShippingPage.SelectShipping();
//			
//	}
	
	@Test (priority = 7)
	public void PaymentAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Select Your Payment Method"
				+ "</b></p>");
		
		BillingAddress paymentPage = new BillingAddress(childTest);
		paymentPage.SelectPayment();
			
	}
		
		
	
	@Test (priority = 8)
	public void ClickOnorderSystem() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Order Your Product</b></p>");
		
		BillingAddress OrderPerfectPage = new BillingAddress(childTest);
		OrderPerfectPage.SelectOrder();
				
	}
	

	@AfterClass
	public void afterClass() {
		report.flush();
	}



}
