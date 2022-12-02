package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import drivers.BaseDrivers;
import drivers.PageDriver;


import pages.LogOut;
import utilities.ExtentFactory;

public class AccountCreate4 extends BaseDrivers {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl () {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Created</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	@Test (priority = 0)
	public void createAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click  sign In"
				+ "</b></p>");
		
		LogOut logOutPage = new LogOut(childTest);
		logOutPage.clickOnLogOutButton();
			
	}
		
		
	@AfterClass
	public void afterClass() {
		report.flush();
	}



}
