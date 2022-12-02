package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import drivers.BaseDrivers;
import drivers.PageDriver;


import pages.LogInPage;
import utilities.ExtentFactory;

public class AccountCreate5 extends BaseDrivers {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl () {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>LogIn Page</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	@Test (priority = 0)
	public void createLogIn() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Check UserName valid or not"
				+ "</b></p>");
		
		LogInPage logPage = new LogInPage(childTest);
		logPage.clickNameButton();
			
	}
		
		
	
	@Test (priority = 1)
	public void ClickPasswordIn() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Matching or not</b></p>");
		
		LogInPage InfoProvide = new LogInPage(childTest);
		InfoProvide.InputPasswordButton();
//		InfoProvide.clickOnLogInButton();
		
		
		
	}
	
	@Test (priority = 2)
	public void ClickLogInPageButton() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Log Button</b></p>");
		
		LogInPage LogProvide = new LogInPage(childTest);
		
		LogProvide.clickOnLogInButton();
		
		
		
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}



}
