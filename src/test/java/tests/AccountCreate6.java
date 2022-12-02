package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import drivers.BaseDrivers;
import drivers.PageDriver;

import pages.PreOrder;
import utilities.ExtentFactory;

public class AccountCreate6 extends BaseDrivers {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl () {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Confirm Your Books</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	@Test (priority = 0)
	public void OrderAccount() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Pre Order Selected"
				+ "</b></p>");
		
		PreOrder PreorderPage = new PreOrder(childTest);
		PreorderPage.PreOrderSelect();
			
	}
		
		
	
	@Test (priority = 1)
	public void ConfirmPreOrder() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Select Order Next Page</b></p>");
		
		PreOrder OrderProvide = new PreOrder(childTest);
		OrderProvide.ConfirmOrder();
		
		
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}



}
